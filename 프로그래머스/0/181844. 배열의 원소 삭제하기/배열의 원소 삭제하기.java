import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> arr_set = new LinkedHashSet<>();
        Set<Integer> delete_set = new LinkedHashSet<>();
        for (int num : arr) arr_set.add(num);
        for (int num : delete_list) delete_set.add(num);
        arr_set.removeAll(delete_set);
        return arr_set.stream().mapToInt(Integer::intValue).toArray();
    }
}