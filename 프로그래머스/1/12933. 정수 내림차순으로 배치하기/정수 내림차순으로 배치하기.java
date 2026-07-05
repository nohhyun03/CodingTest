import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = (n+"").split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.valueOf(String.join("", arr));
    }
}