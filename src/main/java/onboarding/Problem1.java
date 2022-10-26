package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (!isValidInput(pobi) || !isValidInput(crong)) {
            return -1;
        }
        int pobiScore = getScoreWithPageList(pobi);
        int crongScore = getScoreWithPageList(crong);

        if (pobiScore == crongScore) {
            return 0;
        }
        if (pobiScore > crongScore) {
            return 1;
        }
        return 2;
    }

    private static boolean isValidInput(List<Integer> pages) {
        if (!isPageListInRange(pages)) {
            return false;
        }
        if (!isPageListConsecutive(pages)) {
            return false;
        }
        if (!isPageListExist(pages)) {
            return false;
        }
        return true;
    }

    private static boolean isPageListInRange(List<Integer> pages) {
        if (!isPageInRange(pages.get(0))) {
            return false;
        }
        if (!isPageInRange(pages.get(1))) {
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

    private static boolean isPageListConsecutive(List<Integer> pages) {
        if (pages.get(0) + 1 != pages.get(1)) {
            return false;
        }
        return true;
    }

    private static boolean isPageListExist(List<Integer> pages) {
        if (pages.get(0) % 2 == 0) {
            return false;
        }
        if (pages.get(1) % 2 == 1) {
            return false;
        }
        return true;
    }

    private static int getScoreWithPageList(List<Integer> pages) {
        int leftPageScore = getScoreWithPage(pages.get(0));
        int rightPageScore = getScoreWithPage(pages.get(1));
        if (leftPageScore > rightPageScore) {
            return leftPageScore;
        }
        return rightPageScore;
    }

    private static int getScoreWithPage(int page) {
        List<Integer> numberParsed = splitPageToList(page);
        int sumScore = getSumScore(numberParsed);
        int multipleScore = getMultipleScore(numberParsed);
        if (sumScore > multipleScore) {
            return sumScore;
        }
        return multipleScore;
    }

    private static List<Integer> splitPageToList(int page) {
        List<Integer> partialList = new ArrayList<Integer>();
        int number = page;
        while (number > 0) {
            partialList.add(0, number % 10);
            number /= 10;
        }
        return partialList;
    }

    private static int getSumScore(List<Integer> partial) {
        return partial.stream().reduce(0, (total, number) -> total + number);
    }

    private static int getMultipleScore(List<Integer> partial) {
        return partial.stream().reduce(1, (total, number) -> total * number);
    }

}