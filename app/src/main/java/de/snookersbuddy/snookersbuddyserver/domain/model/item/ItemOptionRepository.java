package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Transactional
public interface ItemOptionRepository extends JpaRepository<ItemOption, ItemOptionId> {
    Set<ItemOption> findByItem_Id(Long id);

    void deleteByOptionId(long optionId);
}
