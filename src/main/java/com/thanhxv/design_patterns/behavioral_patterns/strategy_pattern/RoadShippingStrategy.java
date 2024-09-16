package com.thanhxv.design_patterns.behavioral_patterns.strategy_pattern;

public class RoadShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 10.0;
    }
}
