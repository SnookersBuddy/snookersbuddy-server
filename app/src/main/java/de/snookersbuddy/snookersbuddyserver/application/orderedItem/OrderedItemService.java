package de.snookersbuddy.snookersbuddyserver.application.orderedItem;

import de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem.OrderedItem;
import de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem.OrderedItemRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem.CreateOrderInput;
import de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem.GetOrderOutput;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class OrderedItemService {

    private final OrderedItemRepository orderedItemRepository;

    public OrderedItemService(final OrderedItemRepository orderedItemRepository) {
        this.orderedItemRepository = orderedItemRepository;
    }

    public boolean saveOrder(CreateOrderInput createOrderInput) {

        try {
            for (var order : createOrderInput.items()) {
                var orderedItem = new OrderedItem();
                orderedItemRepository.save(orderedItem);
            }
        } catch (DataIntegrityViolationException d) {
            // TODO: LOGGING?
            return false;
        }
        return true;
    }

    public void getRound() {

    }

    public GetOrderOutput getOrder(int orderId) {
//orderedItemRepository.findBy
        return new GetOrderOutput();
    }
}
