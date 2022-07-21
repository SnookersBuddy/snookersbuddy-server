package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(final ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public Set<ItemDTO> getAllItems(){
        final var items = ItemMapper.mapDataObjectsOnTransferObjects(itemRepository.findAll());
        return Set.copyOf(items);    }
}
