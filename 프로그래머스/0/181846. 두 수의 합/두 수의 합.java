import java.util.*;

class Solution {
    public String solution(String a, String b) {
        Deque<String> deque = new ArrayDeque<>();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        while (i >= 0 || j >= 0 || c != 0) {
            int sum = c;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            deque.addFirst(String.valueOf(sum % 10));
            c = sum / 10;
        }      
        return String.join("",deque.toArray(new String[0]));
    }
}