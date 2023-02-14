package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantGroupRepository extends JpaRepository<VariantGroup, Long> {
}
