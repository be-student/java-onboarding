package onboarding.problem5;

import java.util.ArrayList;
import java.util.List;

public class BankMachine {

    //Todo 배열, ArrayList 어떤 게 더 좋은지
    private static final List<Integer> CURRENCY = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
    private final Money money;

    public BankMachine(Money money) {
        this.money = money;
    }

    public List<Integer> convertMoneyToCurrency() {
        //Todo 여기 List를 일급 컬렉션으로 바꾸는 게 좋을지?
        List<Integer> currencyList = new ArrayList();
        int amount = money.getAmount();

        for (int moneys : CURRENCY) {
            currencyList.add(amount / moneys);
            amount %= moneys;
        }
        return currencyList;
    }
}