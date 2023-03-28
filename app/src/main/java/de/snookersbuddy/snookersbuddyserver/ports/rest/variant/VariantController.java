package de.snookersbuddy.snookersbuddyserver.ports.rest.variant;

import de.snookersbuddy.snookersbuddyserver.application.variant.VariantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VariantController {

    private final VariantService variantService;

    private VariantController(final VariantService variantService) {
        this.variantService = variantService;
    }

    @PostMapping("/api/variant")
    @ResponseStatus(HttpStatus.CREATED)
    public void createVariant(@RequestBody VariantInput variantToCreate) {
        this.variantService.saveVariant(variantToCreate);
    }

    @GetMapping("/api/variant/{variantId}")
    public GetVariantOutput getVariant(@PathVariable("variantId") long variantId) {
        var test = this.variantService.getVariantByGroupId(variantId);
        return this.variantService.getVariantByGroupId(variantId);
    }

    @PutMapping(value = "/api/variant/{variantId}")
    public void editVariant(@PathVariable("variantId") long variantId, @RequestBody VariantInput variantToUpdate) {
        this.variantService.updateVariant(variantId, variantToUpdate);
    }

    @DeleteMapping(value = "/api/variant/{variantId}")
    public void deleteVariant(@PathVariable("variantId") long optionId) {
        this.variantService.deleteVariant(optionId);
    }

}
