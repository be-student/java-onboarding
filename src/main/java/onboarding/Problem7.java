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
            scores=new HashMap<>();
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
            List<String> edges = graphWithMap.getOrDefault(vertex1,new ArrayList<>());
            edges.add(vertex2);
            graphWithMap.put(vertex1, edges);
        }

        public void searchWithDepth(String from, int depth) {
            if(depth==0){
                addScore(from,10);
                return;
            }
            graphWithMap.get(from).stream().forEach((edge)->{
                searchWithDepth(edge,depth-1);
            });
        }

        public void addScore(String vertex,int score){
            int beforeScore=scores.getOrDefault(vertex,0);
            scores.put(vertex,beforeScore+score);
        }
        public List<Map.Entry<String,Integer>> getScoreList(){
            return new ArrayList(scores.entrySet());
        }
    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        graphWithScore = new GraphWithScore();
        graphWithScore.createEdge(friends);

        graphWithScore.searchWithDepth(user,2);

        visitors.stream().forEach((visitor)->{
            graphWithScore.addScore(visitor,1);
        });

        System.out.println(graphWithScore.getScoreList());
        List<String> answer = Collections.emptyList();
        return answer;
    }


    private
}
