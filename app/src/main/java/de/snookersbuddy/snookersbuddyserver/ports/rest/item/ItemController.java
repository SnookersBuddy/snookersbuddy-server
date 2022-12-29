package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemService;
import de.snookersbuddy.snookersbuddyserver.ports.rest.assignment.CreateAssignmentInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/api/items")
    public GetItemsOutput getItems() {
        final var items = itemService.getAllItems();
        return new GetItemsOutput(items);
    }

    @GetMapping("/api/create-item")
    public CreateItemsOutput fetchCreationData(){
        return itemService.getAllConfigurationsForItems();
    }

    @PostMapping("/api/create-item")
    public CreateItemsInput createItem(@RequestBody CreateItemsInput createItemsInput){
        return createItemsInput;
    }


}
