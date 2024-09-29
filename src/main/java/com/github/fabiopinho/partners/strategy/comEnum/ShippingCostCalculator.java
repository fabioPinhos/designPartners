package com.github.fabiopinho.partners.strategy.comEnum;

public class ShippingCostCalculator {
    public double calculateShippingCost(ShippingTypeEnum shippingType, double weight){
        return shippingType.getCost(weight);
    }
}
