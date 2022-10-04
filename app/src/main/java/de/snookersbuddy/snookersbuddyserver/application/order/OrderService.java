package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.Order;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void initOrder(Assignment assignment){
        var existingOrder = orderRepository.findOrderByAssignmentIdAndEndTime(assignment.getId(), 0);
        if(existingOrder == null) {
            var newOrder = new Order();
            newOrder.setAssignment(assignment);
            newOrder.setStartTime((int) new Date().getTime());
            newOrder.setEndTime(0);
            Long orderId = orderRepository.save(newOrder).getId();
        }
    }
}
