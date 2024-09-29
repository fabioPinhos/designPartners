package com.github.fabiopinho.partners.strategy.context;

import com.github.fabiopinho.partners.strategy.ShippingCostStrategy;

public class ShippingCostContext {

    private ShippingCostStrategy strategy;

    public void setStrategy(ShippingCostStrategy strategy){
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight){
        return strategy.calculate(weight);
    }
}
