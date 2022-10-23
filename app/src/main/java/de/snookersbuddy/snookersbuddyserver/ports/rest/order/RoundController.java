package de.snookersbuddy.snookersbuddyserver.ports.rest.order;

import de.snookersbuddy.snookersbuddyserver.application.order.OrderService;
import de.snookersbuddy.snookersbuddyserver.application.order.OrderedItemDTO;
import de.snookersbuddy.snookersbuddyserver.application.order.UnpreparedRound;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.RoundState;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RoundController {
    private final OrderService orderService;

    public RoundController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/assignment/{assignmentId}/current-order/round")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRound(@PathVariable("assignmentId") int assignmentId,
            @RequestBody @Valid List<OrderedItemDTO> orderedItemDTOS) {
        orderService.saveRound(orderedItemDTOS, assignmentId);
    }

    @GetMapping(value = "/api/round", params = "status=unprepared")
    public List<UnpreparedRound> getUnpreparedRounds() {
        return orderService.getUnpreparedRounds();
    }

    @PutMapping(value = "/api/round/{roundId}/state")
    public void getUnpreparedRounds(@PathVariable("roundId") long roundId,
            @RequestBody UpdateRoundStateInput input) {
        orderService.updateRoundState(roundId, input.state());
    }
}
