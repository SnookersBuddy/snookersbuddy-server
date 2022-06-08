package de.snookersbuddy.snookersbuddyserver.persistence;

import de.snookersbuddy.snookersbuddyserver.model.datamodel.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

}
