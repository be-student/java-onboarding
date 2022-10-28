package onboarding;

import onboarding.problem1.Pages;

import java.util.List;

class Problem1 {
    private static final int EXCEPTION = -1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        Pages pobiChoice = new Pages(pobi);
        Pages crongCHoice = new Pages(crong);
        if (pobiChoice.isIllegal() || crongCHoice.isIllegal()) {
            return EXCEPTION;
        }

        int answer = Integer.MAX_VALUE;
        return answer;
    }
}