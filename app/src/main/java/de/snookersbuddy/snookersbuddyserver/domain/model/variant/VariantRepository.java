package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VariantRepository extends JpaRepository<Long, Variant> {

    List<Variant> getVariantsByItemId();
}
