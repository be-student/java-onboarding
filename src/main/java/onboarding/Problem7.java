package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Problem7 {
    private static GraphWithScore graphWithScore;

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        graphWithScore = new GraphWithScore();
        graphWithScore.createEdge(friends);

        graphWithScore.searchWithDepth(user, 2);

        visitors.forEach((visitor) -> graphWithScore.addScore(visitor, 1));

        return graphWithScore.getScoreList(user);
    }


    private static class GraphWithScore {
        private final Map<String, List<String>> graphWithMap;
        private final Map<String, Integer> scores;

        public GraphWithScore() {
            graphWithMap = new HashMap<>();
            scores = new HashMap<>();
        }

        public void createEdge(List<List<String>> friends) {
            friends.forEach((friend) -> addBidirectionalEdge(friend.get(0), friend.get(1)));
        }

        private void addBidirectionalEdge(String vertex1, String vertex2) {
            addOneWayEdge(vertex1, vertex2);
            addOneWayEdge(vertex2, vertex1);
        }

        private void addOneWayEdge(String vertex1, String vertex2) {
            List<String> edges = graphWithMap.getOrDefault(vertex1, new ArrayList<>());
            edges.add(vertex2);
            graphWithMap.put(vertex1, edges);
        }

        public void searchWithDepth(String from, int depth) {
            if (depth == 0) {
                addScore(from, 10);
                return;
            }
            graphWithMap.get(from).forEach((edge) -> searchWithDepth(edge, depth - 1));
        }

        public void addScore(String vertex, int score) {
            int beforeScore = scores.getOrDefault(vertex, 0);
            scores.put(vertex, beforeScore + score);
        }

        public List<String> getScoreList(String user) {
            List<Map.Entry<String, Integer>> filtered = filterUser(user);
            List<Map.Entry<String, Integer>> sortedUsers = sorted(filtered);
            return sortedUsers.stream().map(Map.Entry::getKey).limit(5).collect(Collectors.toList());
        }

        private List<Map.Entry<String, Integer>> filterUser(String user) {
            return scores.entrySet().stream().filter((Map.Entry<String, Integer> student) -> {
                if (Objects.equals(student.getKey(), user)) {
                    return false;
                }
                if (student.getValue() == 0) {
                    return false;
                }
                return !graphWithMap.get(user).contains(student.getKey());
            }).collect(Collectors.toList());
        }

        private List<Map.Entry<String, Integer>> sorted(List<Map.Entry<String, Integer>> nicknameScores) {
            return nicknameScores.stream().sorted((Map.Entry<String, Integer> p1, Map.Entry<String, Integer> p2) -> {
                if (p1.getValue() < p2.getValue()) {
                    return 1;
                }
                if (p1.getValue() > p2.getValue()) {
                    return -1;
                }
                return p1.getKey().compareTo(p2.getKey());
            }).collect(Collectors.toList());

        }

    }
}
