import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr){
            list.add(num);
        }
        while (!checkPower(list.size())){
            list.add(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private boolean checkPower(int num){
        while (num % 2 == 0)
            num /= 2;
        return num == 1;
    }
}