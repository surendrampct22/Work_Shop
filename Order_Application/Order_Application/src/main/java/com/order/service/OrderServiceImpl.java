package com.order.service;

import com.order.entity.Order;
import com.order.entity.OrderStatus;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        Order orders=orderRepository.save(order);
        return orders;
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        Optional<Order> order=orderRepository.findById(id);
        return order;
    }

    @Override
    public List<Order> getAllOrderList() {
        List<Order> order=orderRepository.findAll();
        return order;
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order existingOrder =orderRepository.findById(id).get();
        existingOrder.setCustomerName(order.getCustomerName());
        existingOrder.setProductName(order.getProductName());
        existingOrder.setQuantity(order.getQuantity());
        existingOrder.setPrice(order.getPrice());
        existingOrder.setOrderStatus(order.getOrderStatus());
        Order AfterUpdateOrder=  orderRepository.save(existingOrder);

        return AfterUpdateOrder;
    }

    @Override
    public String DeleteOrder(Long id) {
        if (!orderRepository.existsById(id)) {
            throw new RuntimeException("Order not found");
        }

        orderRepository.deleteById(id);
        return "Order deleted successfully";
    }

    public void updateOrderStatus(Long id, OrderStatus status) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setOrderStatus(status);
        orderRepository.save(order);
    }

}
