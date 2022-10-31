package onboarding;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem7Test {
    @Test
    void case4() {
        String user = "andole";
        List<List<String>> friends = List.of(
                List.of("andole", "jun"),
                List.of("donut", "jun"),
                List.of("donut", "shakevan"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "bedi"),
                List.of("anne", "jun")
        );
        List<String> visitors = List.of("donut", "mrko", "peter", "sam");
        List<String> result = List.of("donut", "anne", "bedi", "mrko", "peter");
        assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
    }
}
