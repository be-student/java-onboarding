package onboarding.problem2;

public class Decoder {
    private final Cipher cipherText;

    public Decoder(Cipher cipherText) {
        this.cipherText = cipherText;
    }

    public String decode() {
        StringBuilder beforeRemove = cipherText.getBuilder();
        int beforeLength = beforeRemove.length();
        while (beforeLength > removeConsecutive(beforeRemove).length()) {
            beforeLength = beforeRemove.length();
        }
        return beforeRemove.toString();
    }

    private StringBuilder removeConsecutive(StringBuilder cipher) {

        for (int i = cipher.length() - 1; i >= 0; i--) {
            int deleteIndex = new ConsecutiveFinder(cipher).findConsequence(i);
            RangeDto deleteRange = new RangeDto(deleteIndex, i);
            new Deleter(cipher).delete(deleteRange);
            i = deleteIndex;
        }
        return cipher;
    }
}
