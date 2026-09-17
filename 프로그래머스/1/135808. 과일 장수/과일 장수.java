import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0;
        for (int i = score.length-1; i >= m-1; i -= m){
            int min = score[i];
            for (int j = i-1; j > i-m ; j--)
                if (score[j] < min) min = score[j];
            sum += min * m;
        }
        return sum;
    }
}