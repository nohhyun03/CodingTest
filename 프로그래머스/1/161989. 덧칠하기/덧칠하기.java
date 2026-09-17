import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int[] wall = new int[n];
        Arrays.fill(wall, 1);
        for (int i = 0; i < section.length; i++){
            wall[section[i]-1] = 0;
        }
        int count = 0;
        for (int i = 0; i < n; i++){
            if (wall[i] == 0){
                for (int j = 0; i+j < n && j < m; j++){
                    wall[i+j] = 1;
                }
                count++;
            }
        }
        return count;
    }
}