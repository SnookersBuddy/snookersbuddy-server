package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRoundRepository extends JpaRepository<OrderRound, Long> {
    @Query("select r from OrderRound r where r.state = de.snookersbuddy.snookersbuddyserver.domain.model.order.RoundState.ORDERED")
    List<OrderRound> findUnpreparedRounds();
}