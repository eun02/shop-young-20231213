package shopyoung.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopyoung.domain.*;
import shopyoung.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
