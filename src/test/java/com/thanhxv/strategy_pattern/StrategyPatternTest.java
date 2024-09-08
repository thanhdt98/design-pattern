package com.thanhxv.strategy_pattern;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategyPatternTest {

    @Test
    public void test() {
        ShippingCostStrategy airShippingStrategy = new AirShippingStrategy();
        ShippingCostStrategy roadShippingStrategy = new RoadShippingStrategy();
        ShippingCostStrategy seaShippingStrategy = new SeaShippingStrategy();

        ShippingCostContext context = new ShippingCostContext();
        context.setStrategy(airShippingStrategy);
        Assertions.assertThat(context.calculateShippingCost(1)).isEqualTo(5.0);

        context.setStrategy(roadShippingStrategy);
        Assertions.assertThat(context.calculateShippingCost(1)).isEqualTo(10.0);

        context.setStrategy(seaShippingStrategy);
        Assertions.assertThat(context.calculateShippingCost(1)).isEqualTo(50.0);
    }

}
