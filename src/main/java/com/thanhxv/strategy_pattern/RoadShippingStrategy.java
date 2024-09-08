package com.thanhxv.strategy_pattern;

public class RoadShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 10.0;
    }
}
