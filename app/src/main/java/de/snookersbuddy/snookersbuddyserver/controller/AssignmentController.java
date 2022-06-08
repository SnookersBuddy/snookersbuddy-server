package de.snookersbuddy.snookersbuddyserver.controller;

import de.snookersbuddy.snookersbuddyserver.service.AssignmentService;
import de.snookersbuddy.snookersbuddyserver.transferobjects.CreateAssignmentInput;
import de.snookersbuddy.snookersbuddyserver.transferobjects.GetAssignmentsOutput;
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
    public GetAssignmentsOutput getZuordnungen() {
        return assignmentService.getAllAssignments();
    }

    @PostMapping("api/assignments/create")
    public boolean createCustomAssignment(@RequestBody CreateAssignmentInput createAssignmentInput) {
        return assignmentService.createNewCustomAssignment(createAssignmentInput.getName());
    }
}
