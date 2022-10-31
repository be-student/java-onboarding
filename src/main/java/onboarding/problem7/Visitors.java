package onboarding.problem7;

import java.util.List;
import java.util.stream.Collectors;

public class Visitors {
    private final List<UserId> visitors;

    public Visitors(List<String> visitors) {
        isValid(visitors);
        this.visitors = visitors.stream().map(UserId::new).collect(Collectors.toList());
    }

    private void isValid(List<String> visitors) {
        isNotNull(visitors);
        isValidLength(visitors);
    }

    private void isNotNull(List<String> visitors) {
        if (visitors == null) {
            throw new IllegalArgumentException();
        }
    }

    private void isValidLength(List<String> visitors) {
        if (visitors.size() > 10000) {
            throw new IllegalArgumentException();
        }
    }

    public List<UserId> getVisitors() {
        return visitors;
    }
}