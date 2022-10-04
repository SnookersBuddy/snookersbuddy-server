package de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem;

import lombok.Getter;

@Getter
public enum OrderState {

    ORDERED(0),
    PREPARED(1),
    PAYED(2);

    private final int id;


    OrderState(int id) {
        this.id = id;
    }


}
