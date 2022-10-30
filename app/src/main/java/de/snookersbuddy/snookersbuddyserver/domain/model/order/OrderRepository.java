package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findOrderByAssignmentIdAndEndTime(long assignmentId, int endTime);
}
