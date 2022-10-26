package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        return decrypt(cryptogram);
    }

    private static class Decryption {
        private StringBuilder decryptBuilder;
        private int watching;

        public Decryption(String decryption) {
            watching = 0;
            this.decryptBuilder = new StringBuilder(decryption);
        }

        public boolean isRemained() {
            if (watching < decryptBuilder.length() - 1) {
                return true;
            }
            return false;
        }

        public void searchNext() {
            watching++;
        }

        public boolean isDeletable() {
            if (decryptBuilder.charAt(watching) == decryptBuilder.charAt(watching + 1)) {
                return true;
            }
            return false;
        }

        public void delete() {
            decryptBuilder.delete(watching, watching + 2);
            watching--;
        }

        @Override
        public String toString() {
            return decryptBuilder.toString();
        }
    }
}
