package onboarding.problem2;

public class Cipher {
    private final String cryptogram;

    public Cipher(String cryptogram) {
        this.cryptogram = cryptogram;
        isIllegal();
    }

    private void isIllegal() {
        isNotNull();
        isInRange();
        isOnlySmallCase();
    }

    private void isNotNull() {
        if (this.cryptogram == null) {
            throw new IllegalArgumentException();
        }
    }

    private void isInRange() {
        if (this.cryptogram.length() == 0 || this.cryptogram.length() >= 1001) {
            throw new IllegalArgumentException();
        }
    }

    private void isOnlySmallCase() {
        if (!this.cryptogram.toLowerCase().equals(this.cryptogram)) {
            throw new IllegalArgumentException();
        }
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(cryptogram);
    }
}
