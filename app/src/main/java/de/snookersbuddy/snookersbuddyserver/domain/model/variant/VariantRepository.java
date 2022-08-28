package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository
public interface VariantRepository extends JpaRepository<Variant, Long> {

    @Query("Select o from variants o")
    List<Variant> getVariants();
}
