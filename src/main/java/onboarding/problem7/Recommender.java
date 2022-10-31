package onboarding.problem7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recommender {
    private final RecommendMap score;
    private final SnsNetwork snsNetwork;

    public Recommender(RecommendMap dto, SnsNetwork snsNetwork) {
        this.score = dto;
        this.snsNetwork = snsNetwork;
    }

    public List<String> getFive(UserId user) {
        score.put(user.getId(), 0);
        removeFriendsScore(user);
        System.out.println(score.getStringListMap());
        List<String> keySet = new ArrayList<>(score.getStringListMap().keySet());
        keySet.sort((o1, o2) -> {
            Integer value1 = score.getStringListMap().get(o1);
            Integer value2 = score.getStringListMap().get(o2);
            if (value1 != value2) {
                return value2.compareTo(value1);
            }
            return o1.compareTo(o2);
        });
        return keySet.stream().filter(this::isNotZero).limit(5).collect(Collectors.toList());
    }

    private void removeFriendsScore(UserId user) {
        System.out.println(snsNetwork.getConnection(user).stream().map((id) -> id.getId()).collect(Collectors.toList()));
        snsNetwork.getConnection(user).forEach((friendId) -> score.put(friendId.getId(), 0));
    }

    private boolean isNotZero(String key) {
        return score.getStringListMap().get(key) != 0;
    }
}
