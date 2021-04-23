//https://leetcode.com/problems/brick-wall/
package Arrays;

import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        int rowLength = wall.size();
        HashMap<Integer, Integer> frequencyPerEdge = new HashMap<>();
        int maxEdges = 0;
        for (int curIdx = 0; curIdx<rowLength;curIdx++){
            List<Integer> row = wall.get(curIdx);
            int colLength = row.size();
            Integer edge = 0;
            for (int i=0;i<colLength-1;i++){
                edge+=row.get(i);
                Integer edgeFrequency = (frequencyPerEdge.containsKey(edge) ? frequencyPerEdge.get(edge) : 0) +1;
                frequencyPerEdge.put(edge,edgeFrequency);

                if(edgeFrequency >maxEdges) maxEdges = edgeFrequency;
            }
        }
        return rowLength-maxEdges;
    }
}
