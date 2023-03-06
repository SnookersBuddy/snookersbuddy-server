package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentInput;
import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping("api/assignments/create")
    public boolean createCustomAssignment(@RequestBody CreateAssignmentInput createAssignmentInput) {
        return assignmentService.createNewCustomAssignment(createAssignmentInput.name());
    }

    @PostMapping("/api/assignment")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAssignment(@RequestBody AssignmentInput assignmentToCreate) {
        this.assignmentService.saveAssignment(assignmentToCreate);
    }

    @GetMapping("/api/assignments")
    public GetAssignmentsOutput getAssignments() {
        final var assignments = assignmentService.getAllAssignments();
        return new GetAssignmentsOutput(assignments);
    }

    @GetMapping("/api/assignment/{assignmentId}")
    public GetAssignmentOutput getAssignment(@PathVariable("assignmentId") long assignmentId) {
        final var assignment = assignmentService.getAssignment(assignmentId);
        return new GetAssignmentOutput(
                assignment.id(),
                assignment.abbreviation(),
                assignment.custom(),
                assignment.displayName()
        );
    }

    @PutMapping(value = "/api/assignment/{assignmentId}")
    public void editAssignment(@PathVariable("assignmentId") long assignmentId, @RequestBody AssignmentInput assignmentToUpdate) {
        this.assignmentService.updateAssignment(assignmentId, assignmentToUpdate);
    }

    @DeleteMapping(value = "/api/assignment/{assignmentId}")
    public void deleteAssignment(@PathVariable("assignmentId") long assignmentId) {
        this.assignmentService.deleteAssignment(assignmentId);
    }

}
