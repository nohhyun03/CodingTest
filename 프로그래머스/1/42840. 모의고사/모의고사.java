import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][] p = {{1,2,3,4,5},
                     {2,1,2,3,2,4,2,5},
                     {3,3,1,1,2,2,4,4,5,5}};
        int max = -1;
        for (int i = 0; i < p.length; i++){
            int count = 0;
            
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == p[i][j%(p[i].length)]) count++;
            }
            if (count == max) {
                list.add(i+1);
            } else if (count > max) {
                list.clear();
                list.add(i+1);
                max = count;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}