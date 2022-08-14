package de.snookersbuddy.snookersbuddyserver.domain.model.option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Long, Option> {

    List<Option> getOptionsByItemId();
}
