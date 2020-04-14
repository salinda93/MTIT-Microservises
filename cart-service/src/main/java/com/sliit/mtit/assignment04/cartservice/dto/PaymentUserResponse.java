package com.sliit.mtit.assignment04.cartservice.dto;

public class PaymentUserResponse {

    private String customerId;
    private String message;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
