package com.thanhxv.strategy_pattern;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShippingCostContext {
    ShippingCostStrategy strategy;

    public void setStrategy(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight) {
        return strategy.calculate(weight);
    }
}
