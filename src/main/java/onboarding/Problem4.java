package onboarding;

import onboarding.problem4.FrogTransformer;
import onboarding.problem4.NormalWord;

public class Problem4 {
    public static String solution(String word) {
        return new FrogTransformer(new NormalWord(word)).getTransformed();
    }
}
