package org.dilaraseker;

import org.dilaraseker.controllers.OrderStatisticsController;
import org.dilaraseker.models.OrderDataReader;
import org.dilaraseker.views.OrderStatisticsView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Order data file path
        String filePath = "src/main/resources/orders.json";

        OrderDataReader orderDataReader = new OrderDataReader(filePath);
        OrderStatisticsView orderStatisticsView = new OrderStatisticsView();
        OrderStatisticsController orderStatisticsController = new OrderStatisticsController(orderDataReader, orderStatisticsView);

        orderStatisticsController.processOrders();

    }
}