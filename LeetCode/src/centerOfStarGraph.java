public class centerOfStarGraph {
    public int findCenter(int[][] edges) {
        int common1 = edges[0][0];
        int common2 = edges[0][1];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[0].length; j++) {
                if (edges[i][j] == common1) count1++;
                if (edges[i][j] == common2) count2++;
            }
        }
        if (count1 > count2) {
            return edges[0][0];
        } else return edges[0][1];
    }
}
