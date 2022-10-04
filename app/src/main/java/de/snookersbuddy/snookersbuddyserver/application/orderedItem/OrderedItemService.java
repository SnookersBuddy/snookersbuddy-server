package de.snookersbuddy.snookersbuddyserver.application.orderedItem;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.Order;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem.OrderState;
import de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem.OrderedItem;
import de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem.OrderedItemRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem.CreateOrderInput;
import org.springframework.stereotype.Service;

@Service
public class OrderedItemService {

    private final OrderedItemRepository orderedItemRepository;
    private final OrderRepository orderRepository;

    public OrderedItemService(final OrderedItemRepository orderedItemRepository, OrderRepository orderRepository) {
        this.orderedItemRepository = orderedItemRepository;
        this.orderRepository = orderRepository;
    }

    public boolean saveOrder(CreateOrderInput createOrderInput, long assignmentId) {

        try {
            for (var orderedItemDTO : createOrderInput.getOrderedItems()) {

                var orderedItem = new OrderedItem();
                orderedItem.setItem(new Item(orderedItemDTO.getItem().getId()));
                orderedItem.setChosenOptions(orderedItemDTO.getOptionIdList());
                orderedItem.setChosenVariants(orderedItemDTO.getVariantIdList());
                orderedItem.setComment("");
                //TODO - AutoIncrement Round by OrderID
                orderedItem.setRound(1);
                orderedItem.setState(OrderState.ORDERED.getId());

                var order = orderRepository.findOrderByAssignmentIdAndEndTime(assignmentId, 0);
                orderedItem.setOrder(order);

                orderedItemRepository.save(orderedItem);
            }
        } catch (Exception d) {
            // TODO: LOGGING?
            d.printStackTrace();
            return false;
        }
        return true;
    }

    public void getRound() {

    }

    public Order getOrderByAssignmentId(int assignmentId, int endTime) {

        return orderRepository.findOrderByAssignmentIdAndEndTime(assignmentId, endTime);
    }
}
