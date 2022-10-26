package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!isValidInput(pobi) || !isValidInput(crong)) {
            return -1;
        }
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    private static boolean isValidInput(List<Integer> pages) {
        if (!isPageListInRange(pages)) {
            return false;
        }
        return true;
    }

    private static boolean isPageListInRange(List<Integer> pages) {
        if (isPageInRange(pages.get(0))) {
            return false;
        }
        if (isPageInRange(pages.get(1))) {
            return false;
        }
        return true;
    }

    private static boolean isPageInRange(int page) {
        if (page <= 1 + 1 || page >= 400 - 1) {
            return false;
        }
        return true;
    }
}