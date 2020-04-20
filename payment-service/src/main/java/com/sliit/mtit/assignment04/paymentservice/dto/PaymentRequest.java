package com.sliit.mtit.assignment04.paymentservice.dto;

public class PaymentRequest {

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

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "customerName='" + customerName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
