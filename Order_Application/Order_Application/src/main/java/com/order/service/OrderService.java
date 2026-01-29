package com.order.service;

import com.order.entity.Order;
import com.order.entity.OrderStatus;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    //For Create a Order
    Order createOrder(Order order);

    //fetch the order by id
    Optional <Order> getOrderById(Long id);

    //Get all type of order
    List<Order> getAllOrderList();

    //fetch order by id and update the order(save)
    Order updateOrder(Long id,Order order);

    //Delete order by id
    String DeleteOrder(Long id);

    //Fetch order by id and check status
    public void updateOrderStatus(Long id, OrderStatus orderStatus);

}
