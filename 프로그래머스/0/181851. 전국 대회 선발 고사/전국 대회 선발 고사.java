import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> avail_list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++){
            if (attendance[i]) avail_list.add(rank[i]);
        }
        Collections.sort(avail_list);
        List<Integer> rank_list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++){
            rank_list.add(rank[i]);
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            
            sum += Math.pow(100, 2-i) * rank_list.indexOf(avail_list.get(i));
        }
        return sum;
    }
}