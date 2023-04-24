package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentService;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemService;
import de.snookersbuddy.snookersbuddyserver.application.option.OptionService;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.flywaydb.core.Flyway;

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
        return this.itemService.getTableData();
    }

    @PostMapping("/api/reset-data")
    public void resetData() {
        Flyway flyway =
            Flyway.configure()
            // FIXME: Not suited for production
            .dataSource("jdbc:postgresql://localhost:25432/snookers" , "snookers" , "snookers")
            // TODO: Should be moved to properties and set to true in production
            .cleanDisabled(false)
            .load()
            ;

        // Start the migration
        flyway.clean();
        flyway.migrate();

    }
}
