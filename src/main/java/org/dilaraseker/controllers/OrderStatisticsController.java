package org.dilaraseker.controllers;

import org.dilaraseker.models.Order;
import org.dilaraseker.models.OrderDataReader;
import org.dilaraseker.views.OrderStatisticsView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderStatisticsController {
    private OrderDataReader orderDataReader;
    private OrderStatisticsView orderStatisticsView;

    public OrderStatisticsController(OrderDataReader orderDataReader, OrderStatisticsView orderStatisticsView) {
        this.orderDataReader = orderDataReader;
        this.orderStatisticsView = orderStatisticsView;
    }

    public void processOrders() {
        // Read data from JSON file and convert it into Order objects
        List<Order> orders = orderDataReader.readOrders();

        // Select only data on specific order numbers
        List<Order> selectedOrders = orders.stream()
                .filter(order -> order.getOrderNumber() == 1000 || order.getOrderNumber() == 1001 || order.getOrderNumber() == 1002)
                .collect(Collectors.toList());

        // Statistical calculations
        OrderStatisticsCalculator statisticsCalculator = new OrderStatisticsCalculator(selectedOrders);
        double totalAmount = statisticsCalculator.calculateTotalAmountForAllOrder();
        Map<Integer, Double> totalAmountForEachOrder = statisticsCalculator.calculateTotalAmountForEachOrder();

        // View
        orderStatisticsView.displayTotalAmountForEachOrder(totalAmountForEachOrder);
        orderStatisticsView.displayTotalAmount(totalAmount);

    }
}
