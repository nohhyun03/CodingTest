import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int i;
        for (i = 0; i < d.length; i++){
            if (d[i] > budget) return i;
            else budget -= d[i];
        }
        return i;
    }
}