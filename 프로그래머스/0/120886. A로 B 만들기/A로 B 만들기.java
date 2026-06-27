import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] str_b = before.toCharArray();
        char[] str_a = after.toCharArray();
        Arrays.sort(str_b);
        Arrays.sort(str_a);
        return new String(str_b).equals(new String(str_a)) ? 1 : 0;
    }
}