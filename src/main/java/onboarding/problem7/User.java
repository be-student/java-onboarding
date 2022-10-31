package onboarding.problem7;

public class User {
    private final UserId id;

    public User(String id) {
        this.id = new UserId(id);
    }

    public UserId getId() {
        return id;
    }
}
