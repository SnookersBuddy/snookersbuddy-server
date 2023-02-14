package de.snookersbuddy.snookersbuddyserver.application.option;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemOptionRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.OptionRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.option.GetOptionOutput;
import de.snookersbuddy.snookersbuddyserver.ports.rest.option.OptionInput;
import org.springframework.stereotype.Service;

@Service
public class OptionService {

    private final OptionRepository optionRepository;

    private final ItemOptionRepository itemOptionRepository;

    private OptionService(final OptionRepository optionRepository, final ItemOptionRepository itemOptionRepository) {
        this.optionRepository = optionRepository;
        this.itemOptionRepository = itemOptionRepository;
    }

    public void saveOption(OptionInput optionToCreate) {
        var option = mapOptionInputOnOption(optionToCreate);
        optionRepository.save(option);

    }

    public GetOptionOutput getOption(long optionId) {
        var option = optionRepository.getReferenceById(optionId);
        return GetOptionOutput.fromEntity(OptionDTO.fromEntity(option));

    }

    public void updateOption(long optionId, OptionInput optionToUpdate) {

        final var option = optionRepository.findById(optionId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(
                        "Could not find option with id %s",
                        optionId)));

        option.setName(optionToUpdate.name());
        optionRepository.save(option);
    }

    public void deleteOption(long optionId) {
        this.optionRepository.deleteById(optionId);
    }

    private Option mapOptionInputOnOption(OptionInput optionToCreate) {
        var option = new Option();
        option.setId(optionToCreate.id());
        option.setName(optionToCreate.name());

        return option;
    }
}
