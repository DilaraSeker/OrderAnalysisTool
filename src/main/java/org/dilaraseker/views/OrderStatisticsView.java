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
    public void displayAveragePriceForOrders(Map<Integer, Double> averagePriceForEachOrder) {
        System.out.println("b. Her sipariş numarası için bütün malların ortalama fiyatı:");
        averagePriceForEachOrder.forEach((orderNumber, average) ->
                System.out.println("   Sipariş Numarası: " + orderNumber + ", Ortalama Fiyat: " + average + " TL"));
    }
    public void displayAveragePrice (double averagePrice) {
        System.out.println("   Tüm siparişlerdeki malların ortalama fiyatı: " + averagePrice + " TL");
        System.out.println();
    }
}
