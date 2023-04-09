package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findOrderByAssignmentIdAndEndTime(long assignmentId, int endTime);

    Order findByEndTimeAndAssignment_Id(int endTime, long assignmentId);

    @Modifying
    @Query("Update Order o set o.assignment.id = :assignmentId where o.id = :orderId and o.endTime = :endTime")
    void updateAssignmentOfSelectedActiveOrder(long assignmentId, long orderId, int endTime);
}
