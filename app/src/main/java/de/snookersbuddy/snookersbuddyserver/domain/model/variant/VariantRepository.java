package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
@Transactional
public interface VariantRepository extends JpaRepository<Variant, Long> {

    void deleteByGroupId(long groupId);
}
