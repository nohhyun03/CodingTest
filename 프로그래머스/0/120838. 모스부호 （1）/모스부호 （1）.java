import java.util.*;

class Solution {
    public String solution(String letter) {
        ArrayList<String> morse = new ArrayList<>(Arrays.asList(
    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."
));
        String[] mos_letter = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String mos : mos_letter){
            sb.append((char)(morse.indexOf(mos) + 'a'));
        }
        return sb.toString();
    }
}