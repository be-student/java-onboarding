package onboarding;

import onboarding.problem3.ClapCounter;
import onboarding.problem3.GameNumber;

public class Problem3 {
    public static int solution(int number) {
        return new GameNumber(number).getRange().reduce(0, (total, currentNumber) -> {
            total += new ClapCounter(currentNumber).getClapCount();
            return total;
        });
    }
}
