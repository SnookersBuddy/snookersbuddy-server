package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "order_round")
@TypeDef(name = "json", typeClass = JsonType.class)
@Entity
public class OrderRound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Setter(AccessLevel.NONE)
    @Column(name = "ordered_at", nullable = false, unique = true)
    @Builder.Default
    private Instant orderedAt = Instant.now();

    @Column(name = "ordered_items", nullable = false)
    @Type(type = "json")
    @Builder.Default
    private List<OrderedItem> orderedItems = new ArrayList<>();

    @Column(name = "state", nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private RoundState state = RoundState.ORDERED;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public static OrderRound create(Order order, List<OrderedItem> orderedItems) {
        return OrderRound.builder().order(order).orderedItems(orderedItems).build();
    }
}
