package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final int score;

    public Calculator(Pages pages) {
        int leftScore = calculateScore(pages.getLeftPage());
        int rightScore = calculateScore(pages.getRightPage());

        if (leftScore > rightScore) {
            score = leftScore;
            return;
        }
        score = rightScore;
    }

    private List<Integer> dividePage(int page) {
        List<Integer> division = new ArrayList<>();

        while (page > 0) {
            division.add(page % 10);
            page /= 10;
        }

        return division;
    }

    public int getScore() {
        return this.score;
    }

    private int calculateScore(int page) {
        List<Integer> division = dividePage(page);
        int scoreWithSum = calculateSum(division);
        int scoreWithMultiple = calculateMultiple(division);

        return Math.max(scoreWithSum, scoreWithMultiple);
    }

    private int calculateMultiple(List<Integer> division) {
        return division.stream().reduce(1, (total, number) -> total * number);
    }

    private int calculateSum(List<Integer> division) {
        return division.stream().reduce(0, Integer::sum);
    }
}
