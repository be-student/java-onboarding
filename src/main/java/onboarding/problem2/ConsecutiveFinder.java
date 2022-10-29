package onboarding.problem2;

class ConsecutiveFinder {
    private final StringBuilder target;

    public ConsecutiveFinder(StringBuilder target) {
        this.target = target;
    }

    public boolean isRemained(int index) {
        return target.length() > index;
    }

    public int findConsequence(int index) {
        int i = index;
        while (nextIndexIsSame(index, i)) {
            i--;
        }
        return i;
    }

    private boolean nextIndexIsSame(int baseIndex, int currentIndex) {
        if (currentIndex == 0) {
            return false;
        }
        return target.charAt(baseIndex) == target.charAt(currentIndex - 1);
    }
}
