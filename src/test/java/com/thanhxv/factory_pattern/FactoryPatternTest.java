package com.thanhxv.factory_pattern;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryPatternTest {

    @Test
    public void test() {
        double weight = 10.0;

        ShippingCostStrategy airShipping = ShippingCostFactory.getStrategy("AIR");
        ShippingCostStrategy roadShipping = ShippingCostFactory.getStrategy("ROAD");
        ShippingCostStrategy seaShipping = ShippingCostFactory.getStrategy("SEA");

        Assertions.assertThat(airShipping.calculate(weight)).isEqualTo(50.0);
        Assertions.assertThat(roadShipping.calculate(weight)).isEqualTo(100.0);
        Assertions.assertThat(seaShipping.calculate(weight)).isEqualTo(500.0);
    }

}
