package onboarding;

public class Problem2 {

    public static String solution(String cryptogram) {
        Decryptor decryption = new Decryptor(cryptogram);
//        return decryption.decrypt();
        while (decryption.isRemained()) {
            if (!decryption.isDeletable()) {
                decryption.searchNext();
                continue;
            }
            decryption.delete();
        }
        return decryption.getResult();
    }

    private static class Decryptor {
        private final StringBuilder decryptBuilder;
        private int watching;

        public Decryptor(String decryption) {
            watching = 0;
            this.decryptBuilder = new StringBuilder(decryption);
        }

        public boolean isRemained() {
            return watching < decryptBuilder.length() - 1;
        }

        public void searchNext() {
            watching++;
        }

        public boolean isDeletable() {
            return decryptBuilder.charAt(watching) == decryptBuilder.charAt(watching + 1);
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


        public String getResult() {
            return decryptBuilder.toString();
        }
    }
}
