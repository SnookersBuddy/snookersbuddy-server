package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.Order;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRoundRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.RoundState;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderRoundRepository orderRoundRepository;

    public OrderService(OrderRepository orderRepository, OrderRoundRepository orderRoundRepository) {
        this.orderRepository = orderRepository;
        this.orderRoundRepository = orderRoundRepository;
    }

    public void initOrder(Assignment assignment) {
        var existingOrder = orderRepository.findOrderByAssignmentIdAndEndTime(assignment.getId(), 0);
        if (existingOrder.isEmpty()) {
            final var newOrder = new Order();
            newOrder.setAssignment(assignment);
            newOrder.setStartTime((int) new Date().getTime());
            newOrder.setEndTime(0);
            orderRepository.save(newOrder);
        }
    }

    public void saveRound(List<OrderedItemDTO> orderedItemDTOs, long assignmentId) {
        final var order = orderRepository.findOrderByAssignmentIdAndEndTime(assignmentId, 0).orElseThrow();

        final var orderedItems = orderedItemDTOs.stream().map(OrderedItemDTO::toEntity).toList();
        final var round = order.orderRound(orderedItems);
        orderRoundRepository.save(round);
    }

    public List<UnpreparedRound> getUnpreparedRounds() {
        return orderRoundRepository.findUnpreparedRounds().stream().map(UnpreparedRound::fromEntity).toList();
    }

    public void updateRoundState(long roundId, RoundState state) {
        final var round = orderRoundRepository.findById(roundId)
                                              .orElseThrow(() -> new IllegalArgumentException(String.format(
                                                      "Could not find round with id %s",
                                                      roundId)));

        round.setState(state);
        orderRoundRepository.save(round);
    }
}
