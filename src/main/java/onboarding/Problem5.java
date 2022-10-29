package onboarding;

import onboarding.problem5.BankMachine;
import onboarding.problem5.Money;

import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        return new BankMachine(new Money(money)).convertMoneyToCurrency();
    }
}
