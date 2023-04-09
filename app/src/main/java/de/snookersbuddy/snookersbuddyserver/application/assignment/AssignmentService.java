package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentAvailability;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;
    private final OrderRepository orderRepository;

    public AssignmentService(final AssignmentRepository assignmentRepository, final OrderRepository orderRepository) {
        this.assignmentRepository = assignmentRepository;
        this.orderRepository = orderRepository;
    }

    public Set<AssignmentDTO> getAllAssignments() {
        final var assignments = AssignmentDTO.fromEntitySet(assignmentRepository.findAll());
        return Set.copyOf(assignments);
    }

    public void saveAssignment(AssignmentInput assignmentToCreate) {
        var assignment = mapAssignmentInputOnAssignment(assignmentToCreate);
        assignmentRepository.save(assignment);
    }

    public void updateAssignment(long assignmentId, AssignmentInput assignmentToUpdate) {
        final var assignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(
                        "Could not find assignment with id %s",
                        assignmentId)));

        assignment.setDisplayName(assignmentToUpdate.displayName());
        assignment.setCustom(assignmentToUpdate.custom());
        assignment.setAbbreviation(assignmentToUpdate.abbreviation());
        assignmentRepository.save(assignment);
    }

    public void deleteAssignment(long assignmentId) {
        this.assignmentRepository.deleteById(assignmentId);
    }

    private Assignment mapAssignmentInputOnAssignment(final AssignmentInput assignmentInput) {
        var assignment = new Assignment();
        assignment.setDisplayName(assignmentInput.displayName());
        assignment.setCustom(assignmentInput.custom());
        assignment.setAbbreviation(assignmentInput.abbreviation());
        assignment.setAvailability(AssignmentAvailability.FREE);
        return assignment;
    }

    public AssignmentDTO getAssignment(long id) {
        return AssignmentDTO.fromEntity(assignmentRepository.getReferenceById(id));
    }

    public void occupyById(Long id) {
        setAvailabilityById(id, AssignmentAvailability.OCCUPIED);
    }

    public void freeById(Long id) {
        setAvailabilityById(id, AssignmentAvailability.FREE);
    }

    private void setAvailabilityById(Long id, AssignmentAvailability availability) {
        final var assignment = assignmentRepository.findById(id).orElseThrow();
        assignment.setAvailability(availability);
        assignmentRepository.save(assignment);
    }

    @Transactional
    public void switchOrderToAnotherAssignment(final long oldAssignmentId, final long newAssignmentId) {

        final var oldAssignment = assignmentRepository.findById(oldAssignmentId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(
                        "Could not find assignment with id %s",
                        oldAssignmentId)));

        final var newAssignment = assignmentRepository.findById(newAssignmentId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(
                        "Could not find assignment with id %s",
                        newAssignmentId)));

        // only the snooker order has to be updated, all rounds are referenced by this entry.
        if (newAssignment.getAvailability() != AssignmentAvailability.BLOCKED) {

            // set the assignment of order to new assignment - in case of already used assignment -> switch tables
            var orderOfNewAssignment = orderRepository.findByEndTimeAndAssignment_Id(0, newAssignmentId);
            var orderOfOldAssignment = orderRepository.findByEndTimeAndAssignment_Id(0, oldAssignmentId);
            if (orderOfOldAssignment == null) {
                throw new IllegalArgumentException();
                // TODO - Error for FE - OldAssignment has no order - shouldnt be possible
            }

            this.orderRepository.updateAssignmentOfSelectedActiveOrder(newAssignmentId, orderOfOldAssignment.getId(), 0);
            var oderIdOfNewAssignment = orderOfNewAssignment != null ? orderOfNewAssignment.getId() : 0;
            this.orderRepository.updateAssignmentOfSelectedActiveOrder(oldAssignmentId, oderIdOfNewAssignment, 0);

            // update availabilities of assignments
            var availabilityForOldAssignment = newAssignment.getAvailability() == AssignmentAvailability.OCCUPIED
                    ? AssignmentAvailability.OCCUPIED : AssignmentAvailability.FREE;
            oldAssignment.setAvailability(availabilityForOldAssignment);
            newAssignment.setAvailability(AssignmentAvailability.OCCUPIED);
            this.assignmentRepository.save(oldAssignment);
            this.assignmentRepository.save(newAssignment);
        } else {
            throw new IllegalArgumentException();
            // TODO - Error for FE - Target Assignment is blocked - shouldnt be possible
        }
    }
}
