package shopyoung.domain;

import java.util.*;
import lombok.*;
import shopyoung.domain.*;
import shopyoung.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;
}
