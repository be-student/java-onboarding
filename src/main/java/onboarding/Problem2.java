package onboarding;

public class Problem2 {
    private static Decryption decryption;

    public static String solution(String cryptogram) {
        decryption = new Decryption(cryptogram);
        while (decryption.isRemained()) {
            if (!decryption.isDeletable()) {
                decryption.searchNext();
                continue;
            }
            decryption.delete();
        }
        return decryption.toString();
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
            int i = 1;
            for (; watching + i < decryptBuilder.length(); i++) {
                if (decryptBuilder.charAt(watching) != decryptBuilder.charAt(watching + i)) {
                    break;
                }
            }
            decryptBuilder.delete(watching, watching + i);
            minusWatching();
        }

        private void minusWatching(){
            if (watching > 0) {
                watching--;
            }
        }

        @Override
        public String toString() {
            return decryptBuilder.toString();
        }
    }
}
