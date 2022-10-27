package onboarding;

import java.util.List;

public class Problem6 {
    private static Map<String, String> InvertedMap = new HashMap<String, String>();
    private static Set<String> answer = new HashSet<String>();

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

    private static void findDuplicated(String userEmail, List<String> tokens) {
        for(int i=0;i<tokens.size();i++){
            String duplicatedEmail=InvertedMap.get(tokens.get(i));
            if(duplicatedEmail!=null){
                answer.add(userEmail);
                answer.add(duplicatedEmail);
                break;
            }
            InvertedMap.put(tokens.get(i),userEmail);
        }
    }
}
