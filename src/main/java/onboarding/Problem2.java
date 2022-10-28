package onboarding;

import onboarding.problem2.Cipher;

public class Problem2 {
    public static String solution(String cryptogram) {
        return new Cipher(cryptogram).getDecryptText();
    }
}
