import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        Deque<Integer> dq = new ArrayDeque<>();
        int sum = 0;
        int i;
        for (i = -num/2; dq.size() < num; i++){
            sum += i;
            dq.addLast(i);
        }
        while (sum != total){
            sum -= dq.removeFirst();
            dq.addLast(i);
            sum += i;
            i++;
        }
        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}