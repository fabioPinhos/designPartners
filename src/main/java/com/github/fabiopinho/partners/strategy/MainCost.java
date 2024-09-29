package com.github.fabiopinho.partners.strategy;

public class MainCost {

    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        double weigth = 10.0;

        String shippingType1 = "STANDARD";
        double cost1 = calculator.calculateShippingCost(shippingType1, weigth);
        System.out.println("Shipping cost for " +shippingType1 + ": " + cost1);

        String shippingType2 = "EXPRESS";
        double cost2 = calculator.calculateShippingCost(shippingType2, weigth);
        System.out.println("Shipping cost for " +shippingType2 + ": " + cost2);

        String shippingType3 = "SAME_DAY";
        double cost3 = calculator.calculateShippingCost(shippingType3, weigth);
        System.out.println("Shipping cost for " +shippingType3 + ": " + cost3);

        String shippingType4 = "INTERNATIONAL";
        double cost4 = calculator.calculateShippingCost(shippingType4, weigth);
        System.out.println("Shipping cost for " +shippingType4 + ": " + cost4);

        String shippingType5 = "OVERNIGHT";
        double cost5 = calculator.calculateShippingCost(shippingType5, weigth);
        System.out.println("Shipping cost for " +shippingType5 + ": " + cost5);

    }
}
