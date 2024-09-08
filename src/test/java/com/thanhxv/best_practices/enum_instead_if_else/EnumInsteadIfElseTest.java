package com.thanhxv.best_practices.enum_instead_if_else;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnumInsteadIfElseTest {

    @Test
    public void test() {
        double weight = 10.0;

        Assertions.assertThat(ShippingType.AIR.getCost(weight)).isEqualTo(50.0);
        Assertions.assertThat(ShippingType.ROAD.getCost(weight)).isEqualTo(100.0);
        Assertions.assertThat(ShippingType.SEA.getCost(weight)).isEqualTo(500.0);
    }

}
