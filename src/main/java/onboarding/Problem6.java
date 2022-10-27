package onboarding;

import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    private static List<String> getTokens(String nickname) {
        List<String> tokens = new ArrayList<>();
        for (int i = 0; i < nickname.length() - 1; i++) {
            tokens.add(nickname.substring(i, i + 2));
        }
        return tokens;
    }
}
