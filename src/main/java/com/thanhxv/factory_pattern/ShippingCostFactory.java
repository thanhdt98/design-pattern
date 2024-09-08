package com.thanhxv.factory_pattern;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShippingCostFactory {
    static Map<String, ShippingCostStrategy> strategies = new HashMap<>();

    static {
        strategies.put("AIR", new AirShippingStrategy());
        strategies.put("ROAD", new RoadShippingStrategy());
        strategies.put("SEA", new SeaShippingStrategy());
    }

    public static ShippingCostStrategy getStrategy(String type) {
        ShippingCostStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid shipping type: " + type);
        }
        return strategy;
    }

}
