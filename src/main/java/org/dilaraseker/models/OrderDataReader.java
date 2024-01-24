package org.dilaraseker.models;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class OrderDataReader {
    private String filePath;

    public OrderDataReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Order> readOrders() {
        List<Order> orderList = new ArrayList<>();

        try {
            // Read JSON file
            FileReader reader = new FileReader(filePath);
            JSONArray ordersArray = new JSONArray(new JSONTokener(reader));

            // Convert each JSON object to Order object
            for (int i = 0; i < ordersArray.length(); i++) {

                JSONObject orderJson = ordersArray.getJSONObject(i);

                int orderNumber = orderJson.getInt("Sipariş");
                int productNumber = orderJson.getInt("Mal Numarası");
                int quantity = orderJson.getInt("Miktar");
                double unitPrice = orderJson.getDouble("Birim Fiyat (TL)");

                Order order = new Order(orderNumber, productNumber, quantity, unitPrice);
                orderList.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return orderList;
    }
}
