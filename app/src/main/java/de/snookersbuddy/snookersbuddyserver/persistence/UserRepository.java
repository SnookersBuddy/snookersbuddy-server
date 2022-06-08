package de.snookersbuddy.snookersbuddyserver.persistence;

import de.snookersbuddy.snookersbuddyserver.model.datamodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
