package org.dilaraseker.models;

public class Order {
    private int orderNumber;
    private int productNumber;
    private int quantity;
    private double unitPrice;

    public Order(int orderNumber, int productNumber, int quantity, double unitPrice) {
        this.orderNumber = orderNumber;
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", productNumber=" + productNumber +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
