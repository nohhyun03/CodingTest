import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int num : arr){
            if (stk.size() != 0 && stk.peek() == num) stk.pop();
            else stk.push(num);
        }
        return stk.size() == 0 ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}