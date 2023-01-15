package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Transactional
public interface ItemVariantRepository extends JpaRepository<ItemVariant, ItemVariantId> {
    Set<ItemVariant> findByItem_Id(Long id);

    @Modifying
    @Query("Delete from ItemVariant i where i.variant.id IN (Select v.id from Variant v where v.group.id =:variantGroupId)")
    void deleteByVariantGroupId(long variantGroupId);
}
