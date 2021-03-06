package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1091ShortestPathinBinaryMatrix {
    int[][] dir ={
            {0,1},
            {1,0},
            {-1,0},
            {0,-1},
            {1,-1},
            {-1,1},
            {-1,-1},
            {1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int c = grid.length;
        int r = grid[0].length;
        boolean[][] visited = new boolean[c][r];
        visited[0][0] = true;

        if(grid[0][0] == 1 || grid[c-1][r-1] == 1)
            return -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int pop[] = queue.remove();
                if(pop[0] == c-1 && pop[1] == r-1){
                    return ans + 1;
                }
                for(int k = 0 ; k < 8 ; k++){
                    int nextX = dir[k][0] + pop[0];
                    int nextY = dir[k][1] + pop[1];

                    if(nextX>=0 && nextX<c &&
                            nextY>=0 && nextY<r &&
                            !visited[nextX][nextY] &&
                            grid[nextX][nextY]==0 ){
                        queue.add(new int[]{nextX,nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
    public static void  main(String[] ars){
        int[][] data ={{0,0,0},{1,1,0},{1,1,0}};
        Solution1091ShortestPathinBinaryMatrix test = new Solution1091ShortestPathinBinaryMatrix();
        System.out.println(test.shortestPathBinaryMatrix(data));
    }
}
//https://leetcode.com/problems/shortest-path-in-binary-matrix/discuss/314546/Java-BFS
//Runtime: 21 ms, faster than 56.67% of Java online submissions for Shortest Path in Binary Matrix.
//Memory Usage: 48.7 MB, less than 100.00% of Java online submissions for Shortest Path in Binary Matrix.