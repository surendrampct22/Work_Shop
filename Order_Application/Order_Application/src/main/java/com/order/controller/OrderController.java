package com.order.controller;


import com.order.entity.Order;
import com.order.entity.OrderStatus;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*{
        "customerName": "varsha",
        "productName": "Mobile",
        "quantity": 3,
        "price": 40000.00,
        "orderStatus": "CREATED"
        }*/



@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/save")
    //http://localhost:9090/order/save
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order orderSave=orderService.createOrder(order);
                return ResponseEntity.status(HttpStatus.CREATED).body(orderSave);
    }

    @GetMapping("/{id}")
    //http://localhost:9090/order/1
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {

        return orderService.getOrderById(id)
                .map(order -> ResponseEntity.ok(order))
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    //http://localhost:9090/order
    public ResponseEntity<List<Order>>getAllOrderList(){
       List <Order> getAllOrder= orderService.getAllOrderList();
        return ResponseEntity.ok(getAllOrder);
    }
    @PutMapping("/{id}")
    //http://localhost:9090/order/1
    public ResponseEntity<Order> updateOrder(
            @PathVariable Long id,
            @RequestBody Order order) {

        Order updatedOrder = orderService.updateOrder(id, order);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("/{id}")
    //http://localhost:9090/order/1
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {

        String message = orderService.DeleteOrder(id);

        return ResponseEntity.ok(message);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<String> updateOrderStatus(
            @PathVariable Long id,
            @RequestBody OrderStatus request) {

        orderService.updateOrderStatus(id, request);
        return ResponseEntity.ok("Order status updated successfully");
    }
}

