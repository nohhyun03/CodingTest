import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0;
        for (int i = score.length-1; i >= m-1; i -= m){
            sum += score[i-m+1]* m;
        }
        return sum;
    }
}