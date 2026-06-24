import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);
        int j = 0;
        for (int i = 0; i < my_string.length(); i++){
            if (j >= indices.length || i != indices[j]) sb.append(my_string.charAt(i));
            else j++;
        }
        return sb.toString();
    }
}