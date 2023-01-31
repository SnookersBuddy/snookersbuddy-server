package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.ItemConfigurationService;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemService;
import de.snookersbuddy.snookersbuddyserver.ports.rest.configuration.GetConfigurationOutput;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    private final ItemService itemService;

    private final ItemConfigurationService itemConfigurationService;

    public ItemController(final ItemService itemService, final ItemConfigurationService itemConfigurationService) {
        this.itemService = itemService;
        this.itemConfigurationService = itemConfigurationService;
    }

    @GetMapping("/api/items")
    public GetItemsOutput getItems() {
        final var items = itemService.getAllItems();
        return new GetItemsOutput(items);
    }

    @GetMapping("/api/item-creation-data")
    public CreateItemsOutput fetchCreationData() {
        return itemService.getAllConfigurationsForItems();
    }

    @GetMapping("/api/item/{itemId}")
    public GetConfigurationOutput getItemConfiguration(@PathVariable("itemId") long itemId) {
        return itemConfigurationService.getItemConfigurationById(itemId);
    }

    @PostMapping("/api/item") //TODO RENAMED IN BE
    public boolean createItem(@RequestBody CreateItemsInput createItemsInput) {
        return itemService.createItem(createItemsInput);
    }

    @DeleteMapping("api/item/{itemId}")
    public void deleteItem(@PathVariable("itemId") long itemId) {
        this.itemService.deleteItem(itemId);
    }

    @PutMapping("api/item/{itemId}")
    public void editItem(@PathVariable("itemId") long itemId, @RequestBody CreateItemsInput itemToUpdate) {
        this.itemService.updateItem(itemId, itemToUpdate);
    }
}
