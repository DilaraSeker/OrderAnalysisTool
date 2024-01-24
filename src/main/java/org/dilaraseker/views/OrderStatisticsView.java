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
    public void displayAveragePricePerProduct(Map<Integer, Double> averagePricePerProduct) {
        System.out.println("c. Tüm siparişler için her bir ürünün ortalama fiyatı:");
        averagePricePerProduct.forEach((productNumber, averagePrice) ->
                System.out.println("   Mal Numarası: " + productNumber + ", Ortalama Fiyat: " + averagePrice + " TL"));
        System.out.println();
    }
    public void displayProductCountPerOrder(Map<Integer, Map<Integer, Long>> productCountPerOrder) {
        System.out.println("d. Tek tek mal bazlı, malların hangi siparişlerde kaç adet olduğunun çıktısı:");
        productCountPerOrder.forEach((productNumber, orderQuantityMap) -> {
            System.out.println("   Mal Numarası: " + productNumber);
            orderQuantityMap.forEach((orderNumber, quantity) ->
                    System.out.println("    Sipariş Numarası: " + orderNumber + ", Adet: " + quantity));
        });
        System.out.println();
    }

}
