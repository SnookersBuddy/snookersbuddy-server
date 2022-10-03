package de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedItemRepository  extends JpaRepository<OrderedItem, Long> {
}
