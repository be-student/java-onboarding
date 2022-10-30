package onboarding.problem6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("유저 목록 기능 테스트")
public class UsersTest {
    @DisplayName("유저 목록이 필터되어서 잘 가져와진다")
    @Test
    void 유저_정보들() {
        List<String> 입력1 = List.of("WrongEmail", "사람");
        List<String> 입력2 = List.of("right@email.com", "사람");
        List<String> 입력3 = List.of("right@email.com", "not한글");
        assertThat(new Users(List.of(입력1, 입력2, 입력3)).getUserInfos().size()).isEqualTo(1);
        assertThat(new Users(List.of(입력1, 입력2, 입력3)).getUserInfos().get(0).getEmail()).isEqualTo();

        List.of(new UserInfo(입력2))
    }
}
