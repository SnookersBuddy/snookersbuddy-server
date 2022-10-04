package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    public Order findOrderByAssignmentIdAndEndTime(long assignmentId, int endtime);
}
