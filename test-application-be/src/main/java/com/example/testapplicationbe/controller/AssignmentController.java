package com.example.testapplicationbe.controller;

import com.example.testapplicationbe.service.AssignmentService;
import com.example.testapplicationbe.transferobjects.AssignmentCreateBody;
import com.example.testapplicationbe.transferobjects.AssignmentTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }


    @GetMapping("/api/assignments")
    public AssignmentTO getZuordnungen() {
        return assignmentService.getAllAssignments();
    }

    @PostMapping("api/assignments/create")
    public boolean createCustomAssignment(@RequestBody AssignmentCreateBody assignmentCreateBody) {
        return assignmentService.createNewCustomAssignment(assignmentCreateBody.getName());
    }
}
