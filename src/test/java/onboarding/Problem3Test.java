package onboarding;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem3Test {
    @Test
    void case1() {
        int number = 333;
        int result = 228;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }

    @Test
    void case4() {
        int number = 2;
        int result = 0;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }
}
