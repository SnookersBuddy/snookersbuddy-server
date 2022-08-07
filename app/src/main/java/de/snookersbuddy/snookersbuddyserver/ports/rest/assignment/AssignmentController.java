package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }


    @GetMapping("/api/assignments")
    public GetAssignmentsOutput getAssignments() {
        final var assignments =  assignmentService.getAllAssignments();
        return new GetAssignmentsOutput(assignments);
    }

    @PostMapping("api/assignments/create")
    public boolean createCustomAssignment(@RequestBody CreateAssignmentInput createAssignmentInput) {
        return assignmentService.createNewCustomAssignment(createAssignmentInput.name());
    }
}
