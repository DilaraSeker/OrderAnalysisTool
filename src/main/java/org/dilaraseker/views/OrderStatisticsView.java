package org.dilaraseker.views;

import java.util.Map;


public class OrderStatisticsView {

    public void displayTotalAmount(double totalAmount) {
        System.out.println("   Tüm siparişlerdeki malların toplam tutarı: " + totalAmount + " TL");
        System.out.println();
    }
    public void displayTotalAmountForEachOrder(Map<Integer, Double> totalAmountForEachOrder) {
        System.out.println("a. Üç siparişteki malların toplam tutarı:");
        totalAmountForEachOrder.forEach((orderNumber, totalAmount) ->
                System.out.println("   Sipariş Numarası: " + orderNumber + ", Toplam Tutar: " + totalAmount + " TL"));
    }
}
