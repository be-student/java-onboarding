package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem6 {
    private static Map<String, String> InvertedMap = new HashMap<String, String>();
    private static Set<String> answer = new HashSet<String>();

    public static List<String> solution(List<List<String>> forms) {
        forms.stream().forEach((user) -> {
            List<String> tokenWords = getTokens(user.get(1));
            findDuplicated(user.get(0), tokenWords);
        });

        return new ArrayList<>(answer);
    }

    private static List<String> getTokens(String nickname) {
        List<String> tokens = new ArrayList<>();
        for (int i = 0; i < nickname.length() - 1; i++) {
            tokens.add(nickname.substring(i, i + 2));
        }
        return tokens;
    }

    private static void findDuplicated(String userEmail, List<String> tokens) {
        for (String token : tokens) {
            String duplicatedEmail = InvertedMap.get(token);
            if (duplicatedEmail != null) {
                answer.add(userEmail);
                answer.add(duplicatedEmail);
                return;
            }
            InvertedMap.put(token, userEmail);
        }
    }
}
