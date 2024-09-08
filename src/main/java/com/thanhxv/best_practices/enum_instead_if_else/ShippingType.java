package com.thanhxv.best_practices.enum_instead_if_else;

public enum ShippingType {
    AIR {
        @Override
        public double getCost(double weight) {
            return 5.0 * weight;
        }
    },
    ROAD {
        @Override
        public double getCost(double weight) {
            return 10.0 * weight;
        }
    },
    SEA {
        @Override
        public double getCost(double weight) {
            return 50.0 * weight;
        }
    }
    ;

    public abstract double getCost(double weight);
}
