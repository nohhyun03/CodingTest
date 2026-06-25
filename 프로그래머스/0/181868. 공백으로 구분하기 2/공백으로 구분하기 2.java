import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String str : answer){
            if (!str.equals("")) list.add(str);
        }
        return list.toArray(new String[0]);
    }
}