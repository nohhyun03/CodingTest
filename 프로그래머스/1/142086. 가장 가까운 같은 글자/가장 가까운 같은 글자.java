import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] last_idx = new int[26];
        Arrays.fill(last_idx, -1);
        int[] result = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if (last_idx[s.charAt(i)-'a'] == -1) result[i] = -1;
            else result[i] = i - last_idx[s.charAt(i)-'a'];
            last_idx[s.charAt(i)-'a'] = i;
        }
        return result;
    }
}