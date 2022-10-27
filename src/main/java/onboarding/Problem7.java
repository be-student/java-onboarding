package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem7 {
    private static GraphWithScore graphWithScore;

    private static class GraphWithScore {
        private Map<String, List<String>> graphWithMap;
        private Map<String, Integer> scores;

        public GraphWithScore() {
            graphWithMap = new HashMap<>();
        }

        public void createEdge(List<List<String>> friends) {
            friends.stream().forEach((friend) -> {
                addBidirectionalEdge(friend.get(0), friend.get(1));
            });
        }

        private void addBidirectionalEdge(String vertex1, String vertex2) {
            addOneWayEdge(vertex1, vertex2);
            addOneWayEdge(vertex2, vertex1);
        }

        private void addOneWayEdge(String vertex1, String vertex2) {
            List<String> edges = graphWithMap.get(vertex1);
            if (edges == null) {
                edges = new ArrayList<>();
            }
            edges.add(vertex2);
            graphWithMap.put(vertex1, edges);
        }

    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        graphWithScore = new GraphWithScore();
        graphWithScore.createEdge(friends);

        List<String> answer = Collections.emptyList();
        return answer;
    }


    private
}
