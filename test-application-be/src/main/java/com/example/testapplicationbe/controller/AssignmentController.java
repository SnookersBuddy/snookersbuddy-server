package com.example.testapplicationbe.controller;

import com.example.testapplicationbe.service.AssignmentService;
import com.example.testapplicationbe.transferobjects.CreateAssignmentInput;
import com.example.testapplicationbe.transferobjects.GetAssignmentsOutput;
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
