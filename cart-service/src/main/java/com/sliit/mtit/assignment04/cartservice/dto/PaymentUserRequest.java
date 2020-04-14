package com.sliit.mtit.assignment04.cartservice.dto;

public class PaymentUserRequest {

    private String customerName;
    private String price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
