package de.snookersbuddy.snookersbuddyserver.domain.model.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface OptionRepository extends JpaRepository<Option,Long> {

    @Query("Select o from options o")
    List<Option> getOptions();
}
