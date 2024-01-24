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
    // a. Sipariş numaralarına göre malların toplam tutarı
    public Map<Integer, Double> calculateTotalAmountForEachOrder() {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderNumber,
                        Collectors.summingDouble(order -> order.getQuantity() * order.getUnitPrice())
                ));
    }
    // Sipariş numaralarına göre malların toplam miktarı
    public Map<Integer, Long> calculateTotalQuantityForEachOrder() {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderNumber,
                        Collectors.summingLong(Order::getQuantity )
                ));
    }
    // b. Sipariş numaralarına göre  malların ortalama fiyatı
    public Map<Integer, Double> calculateAveragePriceForOrders() {
        Map<Integer, Double> totalAmountForEachOrder = calculateTotalAmountForEachOrder();
        Map<Integer, Long> totalQuantityForEachOrder = calculateTotalQuantityForEachOrder();
        Map<Integer, Double> result = totalAmountForEachOrder.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() / totalQuantityForEachOrder.get(entry.getKey())
                ));
        return result;
    }
    // Tüm siparişlerin ortalama fiyatı
    public double calculateAveragePrice() {
        double totalAmount = calculateTotalAmountForAllOrder();
        return totalAmount / orders.size();
    }

}
