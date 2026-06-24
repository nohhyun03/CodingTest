import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0, end = num_list.length-1, step = 1;
        switch(n){
            case 4: step = slicer[2];
            case 3: end = slicer[1];
            case 2: start = slicer[0]; break;
            case 1: end = slicer[1];
        }
        for (int i = start; i <= end; i += step)
            list.add(num_list[i]);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}