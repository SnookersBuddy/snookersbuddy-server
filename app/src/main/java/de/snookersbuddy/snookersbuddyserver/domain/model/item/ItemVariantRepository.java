package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ItemVariantRepository extends JpaRepository<ItemVariant, ItemVariantId> {
    Set<ItemVariant> findByItem_Id(Long id);


}
