package de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem;

import de.snookersbuddy.snookersbuddyserver.application.orderedItem.OrderedItemService;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderedItemController {

    private final OrderedItemService orderedItemService;

    public OrderedItemController(OrderedItemService orderedItemService) {
        this.orderedItemService = orderedItemService;
    }

    @PostMapping("/api/order")
    public GetOrderOutput initOrder() {
        return new GetOrderOutput();
    }

    // TODO which params should used in url ? id of assignment?
    @PostMapping("/api/order/{orderId}")
    public void saveRound(@PathVariable("orderId") int orderId, @RequestBody CreateOrderInput createOrderInput) {
        if (createOrderInput != null) {
            orderedItemService.saveOrder(createOrderInput);
        }
        //TODO - Exception/Error Handling ?
    }

    @GetMapping("/api/order/{orderId}")
    public GetRoundOutput getOrder(@PathVariable("orderId") int orderId) {
        final var order = orderedItemService.getOrder(orderId);
        return new GetRoundOutput();
    }
}
