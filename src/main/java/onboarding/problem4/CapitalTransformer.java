package onboarding.problem4;

class CapitalTransformer implements Transformer {
    private final StringBuilder capitalBuilder;

    public CapitalTransformer(String target) {
        this.capitalBuilder = new StringBuilder(target);
    }

    public String getTransformed() {
        //Todo IntStream으로 변경하는것에 대해서 어떻게 생각하는지 피드백 받아볼 예정
        for (int i = 0; i < capitalBuilder.length(); i++) {
            transform(i);
        }
        return capitalBuilder.toString();
    }

    private void transform(int index) {
        if (!isCapital(index)) {
            return;
        }
        char afterAlphabet = inverseAlphabet(capitalBuilder.charAt(index));
        capitalBuilder.setCharAt(index, afterAlphabet);
    }

    private boolean isCapital(int index) {
        return 'A' <= capitalBuilder.charAt(index) && capitalBuilder.charAt(index) <= 'Z';
    }

    private Character inverseAlphabet(char before) {
        return (char) ('Z' - (before - 'A'));
    }
}
