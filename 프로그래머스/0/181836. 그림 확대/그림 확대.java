import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> result = new ArrayList<>();
        
        for (String p : picture){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < p.length(); i++){
                sb.append(String.valueOf(p.charAt(i)).repeat(k));
            }
            for (int i = 0; i < k; i++)
                result.add(sb.toString());
        }
        return result.toArray(new String[0]);
    }
}