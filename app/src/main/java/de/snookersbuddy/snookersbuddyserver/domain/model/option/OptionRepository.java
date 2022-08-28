package de.snookersbuddy.snookersbuddyserver.domain.model.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface OptionRepository extends JpaRepository<Option, Long> {}
