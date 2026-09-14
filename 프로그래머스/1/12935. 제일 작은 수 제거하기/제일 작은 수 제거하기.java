import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        list.remove(list.indexOf(Collections.min(list)));
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}