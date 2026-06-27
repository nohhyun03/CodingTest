import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min_distance = Math.abs(array[0]-n);
        int min_num = array[0];
        for (int num : array){
            int distance = Math.abs(num-n);
            if (distance < min_distance){
                min_distance = distance;
                min_num = num;
            }
        }
        return min_num;
    }
}