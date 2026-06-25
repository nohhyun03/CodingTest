import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int count : arr){
            for (int i = 0; i < count; i++) list.add(count);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}