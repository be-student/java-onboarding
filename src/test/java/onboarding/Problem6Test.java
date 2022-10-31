package onboarding;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem6Test {
    @Test
    void case1() {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이제엠"),
                List.of("jasp@email.com", "박이김"),
                List.of("jp@email.com", "김이박"),
                List.of("qpw@email.com", "김이순"),
                List.of("teemo@email.com", "티모"),
                List.of("banana@email.com", "대위티모"),
                List.of("secondJm@email.com", "제이엠"),
                List.of("apple@email.com", "땷횱봵"),
                List.of("stran@email.com", "횱봵으"),
                List.of("zebra@email.com", "두글자이상의문자가연속적으로이제맞티모")
        );

        List<String> result = List.of("apple@email.com",
                "banana@email.com",
                "jason@email.com",
                "jm@email.com",
                "jp@email.com",
                "mj@email.com",
                "nowm@email.com",
                "qpw@email.com",
                "secondJm@email.com",
                "stran@email.com",
                "teemo@email.com",
                "zebra@email.com");
        assertThat(Problem6.solution(forms)).isEqualTo(result);
    }

    @Test
    void case2() {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠제이워니"),
                List.of("jason@email.com", "제이슨"),
                List.of("woniee@email.com", "워니"),
                List.of("mj@email.com", "엠제이"),
                List.of("nowm@email.com", "이워니")
        );
        List<String> result = List.of("jason@email.com",
                "jm@email.com",
                "mj@email.com",
                "nowm@email.com",
                "woniee@email.com");
        assertThat(Problem6.solution(forms)).isEqualTo(result);
    }

    @Test
    void case3() {
        List<List<String>> forms = List.of(
                List.of("kim@email.com", "김ㅡ이"),
                List.of("nam@email.com", "ㅡ이야"),
                List.of("choi@email.com", "최강"),
                List.of("lee@email.com", "강합니다"),
                List.of("jun@email.com", "왜ㅇㅡ이야")
        );
        List<String> result = List.of("jun@email.com", "kim@email.com", "nam@email.com");
        assertThat(Problem6.solution(forms)).isEqualTo(result);
    }
}
