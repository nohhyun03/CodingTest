import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = String.join("c", String.join("b", myStr.split("a")).split("b")).split("c");
        ArrayList<String> list = new ArrayList<>();
        for (String part : parts){
            if (!part.equals(""))
                list.add(part);
        }
        return list.size() == 0 ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}