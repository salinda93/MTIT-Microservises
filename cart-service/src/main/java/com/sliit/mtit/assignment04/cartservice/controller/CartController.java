package com.sliit.mtit.assignment04.cartservice.controller;

import com.sliit.mtit.assignment04.cartservice.dto.CartRequest;
import com.sliit.mtit.assignment04.cartservice.dto.CartResponse;
import com.sliit.mtit.assignment04.cartservice.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServiceImpl cartService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CartResponse saveCart(@RequestBody CartRequest request){

        System.out.println("Customer Cart Details : "+ request);
        return cartService.saveCart(request);

    }
}
