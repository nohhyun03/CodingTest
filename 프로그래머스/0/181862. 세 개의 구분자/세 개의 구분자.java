import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]+");
        ArrayList<String> list = new ArrayList<>();
        for (String part : parts){
            if (!part.equals(""))
                list.add(part);
        }
        return list.size() == 0 ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}