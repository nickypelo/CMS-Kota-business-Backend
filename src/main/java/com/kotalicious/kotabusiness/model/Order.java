package com.kotalicious.kotabusiness.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {
    private String id;
    private LocalDateTime date;
    private OrderType order_type;

}

