package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemService;
import de.snookersbuddy.snookersbuddyserver.application.option.OptionService;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TableController {

    private final ItemService itemService;

    private final OptionService optionService;

    private final VariantService variantService;

    private TableController(final ItemService itemService, final OptionService optionService, final VariantService variantService) {
        this.itemService = itemService;
        this.optionService = optionService;
        this.variantService = variantService;
    }

    @GetMapping("/api/table-data")
    public GetTableDataOutput getOptions() {
        final var items = itemService.getTableData();
        var test = this.itemService.getTableData();
        return test;
    }

    @PostMapping("/api/option")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOption(@RequestBody OptionInput optionToCreate) {
        this.optionService.saveOption(optionToCreate);
    }

    @PutMapping(value = "/api/option/{optionId}")
    public void editOption(@PathVariable("optionId") long optionId, @RequestBody OptionInput optionToUpdate) {
        this.optionService.updateOption(optionId, optionToUpdate);
    }

    @DeleteMapping(value = "/api/option/{optionId}")
    public void deleteOption(@PathVariable("optionId") long optionId){
        this.optionService.deleteOption(optionId);
    }

    @PostMapping("/api/variant")
    @ResponseStatus(HttpStatus.CREATED)
    public void createVariant(@RequestBody VariantInput variantToCreate) {
        this.variantService.saveVariant(variantToCreate);
    }

    @PutMapping(value = "/api/variant/{variantId}")
    public void editVariant(@PathVariable("variantId") long variantId, @RequestBody VariantInput variantToUpdate) {
        this.variantService.updateVariant(variantId, variantToUpdate);
    }

    @DeleteMapping(value = "/api/variant/{variantId}")
    public void deleteVariant(@PathVariable("variantId") long optionId){
        this.variantService.deleteVariant(optionId);
    }
}
