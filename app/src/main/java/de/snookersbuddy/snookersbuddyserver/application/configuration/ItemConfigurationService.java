package de.snookersbuddy.snookersbuddyserver.application.configuration;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemMapper;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.OptionRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.configuration.GetConfigurationOutput;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemConfigurationService {

    private final OptionRepository optionRepository;

    private final VariantRepository variantRepository;

    private final ItemRepository itemRepository;

    public ItemConfigurationService(OptionRepository optionRepository, VariantRepository variantRepository, ItemRepository itemRepository) {
        this.optionRepository = optionRepository;
        this.variantRepository = variantRepository;
        this.itemRepository = itemRepository;
    }

    public GetConfigurationOutput getItemConfigurationById(long itemId) {

        GetConfigurationOutput getConfigurationOutput = new GetConfigurationOutput();

        List<Variant> variants = variantRepository.getVariantsByItemId();
        List<Option> options = optionRepository.getOptionsByItemId();
        Item selectedItem = itemRepository.getReferenceById(itemId);

        getConfigurationOutput.setVariants(buildVariants(variants));
        getConfigurationOutput.setOptions(buildOptions(options));
        getConfigurationOutput.setItem(ItemMapper.mapDataObjectOnTransferObject(selectedItem));

        return getConfigurationOutput;
    }

    private List<OptionDTO> buildOptions(List<Option> options) {
        return new ArrayList<>();
    }

    private List<VariantDTO> buildVariants(List<Variant> variants) {
        return new ArrayList<>();
    }
}
