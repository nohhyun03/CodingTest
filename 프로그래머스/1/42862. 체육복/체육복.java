import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n+2];
        Arrays.fill(students, 1);
        
        for (int std : lost) {
            students[std]--;
        }
        for (int std : reserve) {
            students[std]++;
        }
        Arrays.sort(reserve);
        for (int std : reserve) {
            if (students[std] == 1) continue;
            if (students[std-1] == 0) {
                students[std-1]++;
                students[std]--;
            }
            else if (students[std+1] == 0) {
                students[std+1]++;
                students[std]--;
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (students[i] != 0) count++;
        }
        return count;
    }
}