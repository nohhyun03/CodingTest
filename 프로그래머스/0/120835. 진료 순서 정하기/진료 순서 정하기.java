import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] order = new int[emergency.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int e : emergency) list.add(e);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < order.length; i++)
            order[i] = list.indexOf(emergency[i]) + 1;
        return order;
    }
}