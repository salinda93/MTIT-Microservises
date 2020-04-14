package com.sliit.mtit.assignment04.cartservice.service;

import com.sliit.mtit.assignment04.cartservice.dto.CartRequest;
import com.sliit.mtit.assignment04.cartservice.dto.CartResponse;
import com.sliit.mtit.assignment04.cartservice.dto.PaymentUserRequest;
import com.sliit.mtit.assignment04.cartservice.dto.PaymentUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CartServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public CartResponse saveCart(CartRequest cartRequest){

        PaymentUserRequest paymentUserRequest = new PaymentUserRequest();
        paymentUserRequest.setCustomerName(cartRequest.getCustomerName());
        paymentUserRequest.setPrice(cartRequest.getPrice());
        ResponseEntity<PaymentUserResponse> paymentUserResponse = restTemplate.postForEntity("http://localhost:8080/customers",paymentUserRequest, PaymentUserResponse.class);

        CartResponse cartResponse = new CartResponse();
        cartResponse.setCartId(UUID.randomUUID().toString());
        cartResponse.setCustomerId(paymentUserResponse.getBody().getCustomerId());
        cartResponse.setMessage("Successfully save the product in Cart.....!!");

        return cartResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();

    }

}
