package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Table(name = "snooker_order")
@Entity
public class Order implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time")
    private int startTime;

    @Column(name = "end_time")
    private int endTime;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "assignment_id", referencedColumnName = "id")
    private Assignment assignment;

    public OrderRound orderRound(List<OrderedItem> orderedItems) {
        return OrderRound.create(this, orderedItems);
    }
}
