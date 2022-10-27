package onboarding;


public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            answer += getClapCount(i);
        }
        return answer;
    }

    private static int getClapCount(int currentNumber) {
        int clap = 0;
        int parsingNumber = currentNumber;
        while (parsingNumber > 0) {
            if (isClapable(parsingNumber)) {
                clap++;
            }
            parsingNumber /= 10;
        }
        return clap;
    }

    private static boolean isClapable(int parsedNumber) {
        if (parsedNumber % 10 == 3) {
            return true;
        }
        if (parsedNumber % 10 == 6) {
            return true;
        }
        if (parsedNumber % 10 == 9) {
            return true;
        }
        return false;
    }
}
