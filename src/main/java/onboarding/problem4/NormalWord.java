package onboarding.problem4;

public class NormalWord {
    private String words;

    public NormalWord(String words) {
        this.words = words;
        isIllegal();
    }

    private void isIllegal() {
        isNotNull();
        isNotInRange();
    }

    private void isNotNull() {
        if (words == null) {
            throw new IllegalArgumentException();
        }
    }

    private void isNotInRange() {
        if (words.length() == 0 || words.length() > 1000) {
            throw new IllegalArgumentException();
        }
    }
}
