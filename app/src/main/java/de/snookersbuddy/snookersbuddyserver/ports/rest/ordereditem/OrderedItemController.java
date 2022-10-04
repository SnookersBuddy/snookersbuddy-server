package de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem;

import de.snookersbuddy.snookersbuddyserver.application.order.OrderService;
import de.snookersbuddy.snookersbuddyserver.application.orderedItem.OrderedItemService;
import de.snookersbuddy.snookersbuddyserver.ports.rest.InitOrderInput;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderedItemController {

    private final OrderedItemService orderedItemService;

    private final OrderService orderService;

    public OrderedItemController(OrderedItemService orderedItemService, OrderService orderService) {
        this.orderedItemService = orderedItemService;
        this.orderService = orderService;
    }

    @PostMapping("api/order")
    public void initOrder(@RequestBody InitOrderInput initOrderInput) {
        if (initOrderInput != null && initOrderInput.assignment() != null) {
            orderService.initOrder(initOrderInput.assignment());
        }
    }

        // TODO which params should used in url ? id of assignment?
        @RequestMapping("api/assignment/{assignmentId}/order")
        public void saveRound ( @PathVariable("assignmentId") int assignmentId, @RequestBody CreateOrderInput createOrderInput){
            if (createOrderInput != null) {
                orderedItemService.saveOrder(createOrderInput, assignmentId);
            }
            //TODO - Exception/Error Handling ?
        }

       /* @GetMapping("api/order/{orderId}")
        public GetRoundOutput getOrder ( @PathVariable("orderId") int orderId){
            final var order = orderedItemService.getOrder(orderId);
            return new GetRoundOutput();
        }*/
    }
