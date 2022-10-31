package onboarding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("1번 문제 테스트")
public class Problem1Test {
    @Test
    void case4() {
        List<Integer> pobi = List.of(399, 400);
        List<Integer> crong = List.of(211, 212);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case5() {
        List<Integer> pobi = List.of(401, 402);
        List<Integer> crong = List.of(211, 212);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case6() {
        List<Integer> pobi = List.of(1, 2);
        List<Integer> crong = List.of(211, 212);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case7() {
        List<Integer> pobi = List.of(99, 100);
        List<Integer> crong = List.of(399, 400);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case8() {
        List<Integer> pobi = List.of(99, 100, 234);
        List<Integer> crong = List.of(111, 112);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case9() {
        List<Integer> pobi = List.of(99);
        List<Integer> crong = List.of(111, 112);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }
}
