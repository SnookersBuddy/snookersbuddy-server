package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@EnableJpaRepositories
@Repository
@Transactional
public interface VariantRepository extends JpaRepository<Variant, Long> {

    Set<Variant> getVariantsByGroupId(long id);

    @Modifying
    @Query("delete from Variant v where v.group.id = :groupId and v.id not in :savedIds")
    void deleteOrphanedVariants(Long groupId, Set<Long> savedIds);
}
