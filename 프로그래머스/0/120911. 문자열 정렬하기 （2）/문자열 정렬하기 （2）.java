import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] result = my_string.toLowerCase().toCharArray();
        Arrays.sort(result);
        return new String(result);
    }
}