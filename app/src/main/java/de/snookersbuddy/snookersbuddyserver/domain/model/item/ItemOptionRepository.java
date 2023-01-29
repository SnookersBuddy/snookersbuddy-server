package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Transactional
public interface ItemOptionRepository extends JpaRepository<ItemOption, ItemOptionId> {

    Set<ItemOption> findByItem_Id(Long id);

    void deleteByOptionId(long optionId);

    void deleteByItemId(long itemId);

    @Modifying
    @Query("Delete from ItemOption i where i.item.id = :itemId and i.option.id not in :optionIds")
    void deleteItemOptionByItemIdWhereOptionIdIsNotIn(long itemId, Set<Long> optionIds);

    ItemOption findByItem_IdAndOption_Id(long itemId, long id);
}
