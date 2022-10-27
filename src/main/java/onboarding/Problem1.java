package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (isValidInput(pobi) || isValidInput(crong)) {
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
            return true;
        }
        if (!isPageListConsecutive(pages)) {
            return true;
        }
        return !isPageListExist(pages);
    }

    private static boolean isPageListInRange(List<Integer> pages) {
        if (!isPageInRange(pages.get(0))) {
            return false;
        }
        return isPageInRange(pages.get(1));
    }

    private static boolean isPageInRange(int page) {
        return page > 1 + 1 && page < 400 - 1;
    }

    private static boolean isPageListConsecutive(List<Integer> pages) {
        return pages.get(0) + 1 == pages.get(1);
    }

    private static boolean isPageListExist(List<Integer> pages) {
        if (pages.get(0) % 2 == 0) {
            return false;
        }
        return pages.get(1) % 2 != 1;
    }

    private static int getScoreWithPageList(List<Integer> pages) {
        int leftPageScore = getScoreWithPage(pages.get(0));
        int rightPageScore = getScoreWithPage(pages.get(1));
        return Math.max(leftPageScore, rightPageScore);
    }

    private static int getScoreWithPage(int page) {
        List<Integer> numberParsed = splitPageToList(page);
        int sumScore = getSumScore(numberParsed);
        int multipleScore = getMultipleScore(numberParsed);
        return Math.max(sumScore, multipleScore);
    }

    private static List<Integer> splitPageToList(int page) {
        List<Integer> partialList = new ArrayList<>();
        int number = page;
        while (number > 0) {
            partialList.add(0, number % 10);
            number /= 10;
        }
        return partialList;
    }

    private static int getSumScore(List<Integer> partial) {
        return partial.stream().reduce(0, Integer::sum);
    }

    private static int getMultipleScore(List<Integer> partial) {
        return partial.stream().reduce(1, (total, number) -> total * number);
    }

}