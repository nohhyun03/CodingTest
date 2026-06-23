import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList();
        int n = 1;
        while(true){
            String binary = Integer.toBinaryString(n);
            int num = Integer.parseInt(binary) * 5;
            if (num >= l && num <= r) list.add(num);
            else if (num > r) break;
            n++;
        }
        if (list.isEmpty()) list.add(-1);
        return list.stream()
           .mapToInt(Integer::intValue)
           .toArray();
    }
}