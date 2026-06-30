import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length-1; i++){
            int min_idx = i;
            for (int j = i+1; j < numlist.length; j++){
                int a = Math.abs(numlist[min_idx]-n);
                int b = Math.abs(numlist[j]-n);
                if (a >= b) min_idx = j;
            }
            int temp = numlist[i];
            numlist[i] = numlist[min_idx];
            numlist[min_idx] = temp;
        }
        return numlist;
    }
}