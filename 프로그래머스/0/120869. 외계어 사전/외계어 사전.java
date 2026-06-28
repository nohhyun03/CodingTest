import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String sp = String.join("", spell);
        for (int i = 0; i < dic.length; i++){
            if (spell.length != dic[i].length()) continue;
            char[] d = dic[i].toCharArray();
            Arrays.sort(d);
            if (sp.equals(new String(d))) return 1;
        }
        return 2;
    }
}