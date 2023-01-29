package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentService;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemService;
import de.snookersbuddy.snookersbuddyserver.application.option.OptionService;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    private final ItemService itemService;

    private final OptionService optionService;

    private final VariantService variantService;

    private final AssignmentService assignmentService;

    private TableController(final ItemService itemService, final OptionService optionService, final VariantService variantService, final AssignmentService assignmentService) {
        this.itemService = itemService;
        this.optionService = optionService;
        this.variantService = variantService;
        this.assignmentService = assignmentService;
    }

    @GetMapping("/api/table-data")
    public GetTableDataOutput getOptions() {
        final var items = itemService.getTableData();
        var test = this.itemService.getTableData();
        return test;
    }
}
