package onboarding;

public class Problem4 {
    private static ReverseWord reverseWord;

    private static class ReverseWord {
        private StringBuilder reverseBuilder;
        private int watching;

        public ReverseWord(String word) {
            reverseBuilder = new StringBuilder(word);
            watching = 0;
        }

        public boolean isRemaining() {
            if (watching < reverseBuilder.length()) {
                return true;
            }
            return false;
        }

        public boolean isChangable() {
            if (isCapital()) {
                return true;
            }
            if (isLower()) {
                return true;
            }
            return false;
        }

        private boolean isCapital() {
            if ('A' <= reverseBuilder.charAt(watching) && 'Z' >= reverseBuilder.charAt(watching)) {
                return true;
            }
            return false;
        }

        private boolean isLower() {
            if ('a' <= reverseBuilder.charAt(watching)) {
                return true;
            }
            return false;
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
        String answer = "";
        return answer;
    }
}
