package com.sliit.mtit.assignment04.paymentservice.controller;

import com.sliit.mtit.assignment04.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.assignment04.paymentservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class PaymentController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){

        System.out.println("Customer Payment Details : "+paymentRequest);

        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setCustomerId(UUID.randomUUID().toString());
        paymentResponse.setMessage("Successfully Created the Payment Details.......!!!");

        return paymentResponse;

    }
}
