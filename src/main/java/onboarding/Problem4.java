package onboarding;

public class Problem4 {

    private static class ReverseWord {
        private final StringBuilder reverseBuilder;
        private int watching;

        public ReverseWord(String word) {
            reverseBuilder = new StringBuilder(word);
            watching = 0;
        }

        public boolean isRemaining() {
            return watching < reverseBuilder.length();
        }

        public boolean isChangable() {
            if (isCapital()) {
                return true;
            }
            return isLower();
        }

        private boolean isCapital() {
            return 'A' <= reverseBuilder.charAt(watching) && 'Z' >= reverseBuilder.charAt(watching);
        }

        private boolean isLower() {
            return 'a' <= reverseBuilder.charAt(watching);
        }

        public void change() {
            if (isCapital()) {
                changeCapital();
                return;
            }
            if (isLower()) {
                changeLower();
            }
        }

        private void changeCapital() {
            char before = reverseBuilder.charAt(watching);
            char after = (char) ('Z' - (before - 'A'));
            reverseBuilder.setCharAt(watching, after);
        }

        private void changeLower() {
            char before = reverseBuilder.charAt(watching);
            char after = (char) ('z' - (before - 'a'));
            reverseBuilder.setCharAt(watching, after);
        }

        public void searchNext() {
            watching++;
        }

        @Override
        public String toString() {
            return reverseBuilder.toString();
        }
    }

    public static String solution(String word) {
        ReverseWord reverseWord = new ReverseWord(word);
        while (reverseWord.isRemaining()) {
            if (reverseWord.isChangable()) {
                reverseWord.change();
            }
            reverseWord.searchNext();
        }
        return reverseWord.toString();
    }
}
