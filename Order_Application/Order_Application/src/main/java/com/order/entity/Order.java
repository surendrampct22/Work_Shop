package com.order.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String customerName;

    @Column
    String productName;

    @Column
    int quantity;

    @Column
    double price;

    @Column
    OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;



}

