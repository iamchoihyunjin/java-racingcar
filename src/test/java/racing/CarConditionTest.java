package racing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import racing.util.CarCondition;

import static org.assertj.core.api.Assertions.assertThat;

public class CarConditionTest {

    @Test
    @RepeatedTest(10)
    void get() {
        assertThat(CarCondition.get()).isBetween(0, 9);
    }
}
