package de.snookersbuddy.snookersbuddyserver.ports.rest.order;

import de.snookersbuddy.snookersbuddyserver.application.order.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/order")
    public void initOrder(@RequestBody @Valid InitOrderInput initOrderInput) {
        orderService.initOrder(initOrderInput.assignment());
    }
}
