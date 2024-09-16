package com.thanhxv.design_patterns.creational_patterns.factory_pattern;

public class AirShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 5.0;
    }
}
