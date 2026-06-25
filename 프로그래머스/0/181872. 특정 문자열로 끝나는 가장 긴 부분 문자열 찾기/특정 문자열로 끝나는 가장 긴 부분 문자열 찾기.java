import java.util.regex.*;

class Solution {
    public String solution(String myString, String pat) {
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(myString);
        int idx = 0;
        while(m.find())
            idx = m.end();
        return myString.substring(0, idx);
    }
}