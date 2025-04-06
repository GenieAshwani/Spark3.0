package com.genie.Payment_Gateway.controller;


import com.genie.Payment_Gateway.entity.PaymentOrder;
import com.genie.Payment_Gateway.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class controller {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/create-order")
    public ResponseEntity<String> createOrder(@RequestBody PaymentOrder order)
    {
        try{
            String serviceOrder = paymentService.createOrder(order);
            return ResponseEntity.ok(serviceOrder);
        }
        catch (Exception e)
        {
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error creating order");
        }

    }


    @PostMapping("/update-order")
    public ResponseEntity<String> updateOrderStatus(@RequestParam String paymentId,
                                                    @RequestParam String orderId,
                                                    @RequestParam String status)
    {
            paymentService.updateOrderStatus(paymentId,orderId,status);
        System.out.println("Email sent successfully...");
        return ResponseEntity.ok("Order updated successfully And Email sent");
    }
}
