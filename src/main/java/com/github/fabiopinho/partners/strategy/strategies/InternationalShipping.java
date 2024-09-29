package com.github.fabiopinho.partners.strategy.strategies;

import com.github.fabiopinho.partners.strategy.ShippingCostStrategy;

public class InternationalShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 50.0;
    }
}
