package de.snookersbuddy.snookersbuddyserver.ports.rest.option;

import de.snookersbuddy.snookersbuddyserver.application.option.OptionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class OptionController {

    private final OptionService optionService;

    private OptionController(final OptionService optionService){
        this.optionService = optionService;
    }

    @PostMapping("/api/option")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOption(@RequestBody OptionInput optionToCreate) {
        this.optionService.saveOption(optionToCreate);
    }

    @GetMapping("/api/option/{optionId}")
    public GetOptionOutput getOption(@PathVariable("optionId") long optionId){
        return this.optionService.getOption(optionId);
    }

    @PutMapping(value = "/api/option/{optionId}")
    public void editOption(@PathVariable("optionId") long optionId, @RequestBody OptionInput optionToUpdate) {
        this.optionService.updateOption(optionId, optionToUpdate);
    }

    @DeleteMapping(value = "/api/option/{optionId}")
    public void deleteOption(@PathVariable("optionId") long optionId) {
        this.optionService.deleteOption(optionId);
    }
}
