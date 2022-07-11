package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTest {

    private final Example example = new Example();

    @Test
    void returnTheSumOfTwoIntegers() {
        final int a = 5;
        final int b = 10;

        final int result = example.sum(a, b);

        assertThat(result)
                .isEqualTo(15);
    }
}
