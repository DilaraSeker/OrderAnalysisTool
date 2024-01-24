package org.dilaraseker.controllers;

import org.dilaraseker.models.Order;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderStatisticsCalculator {
    private List<Order> orders;

    public OrderStatisticsCalculator(List<Order> orders) {
        this.orders = orders;
    }


    // Bütün siparişlerin toplam tutarı
    public double calculateTotalAmountForAllOrder() {
        double totalAmount = 0.0;
        for (Order order : orders) {
            totalAmount += order.getQuantity() * order.getUnitPrice();
        }
        return totalAmount;
    }

}
