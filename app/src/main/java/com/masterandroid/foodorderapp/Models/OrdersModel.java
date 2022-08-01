package com.masterandroid.foodorderapp.Models;

public class OrdersModel {

    int orderImage;
    String soldItemName;

    String pricee;
    String orderNumber;

    public OrdersModel() {
        this.orderImage = orderImage;
        this.soldItemName = soldItemName;
        this.pricee = pricee;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return pricee;
    }

    public void setPrice(String price) {
        this.pricee = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
