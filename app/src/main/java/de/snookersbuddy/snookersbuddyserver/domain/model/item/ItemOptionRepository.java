package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ItemOptionRepository extends JpaRepository<ItemOption, ItemOptionId> {
    Set<ItemOption> findByItem_Id(Long id);
}
