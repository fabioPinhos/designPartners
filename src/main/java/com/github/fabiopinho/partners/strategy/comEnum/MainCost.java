package com.github.fabiopinho.partners.strategy.comEnum;

public class MainCost {
    public static void main(String[] args) {
        var calculator = new ShippingCostCalculator();
        var cost = calculator.calculateShippingCost(ShippingTypeEnum.INTERNATIONAL, 2.5);
        System.out.println("Shipping cost: " + cost);
    }
}
