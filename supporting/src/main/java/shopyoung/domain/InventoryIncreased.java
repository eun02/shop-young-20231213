package shopyoung.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopyoung.domain.*;
import shopyoung.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
    private String name;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
