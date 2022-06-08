package com.example.testapplicationbe.persistence;

import com.example.testapplicationbe.model.datamodel.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

}
