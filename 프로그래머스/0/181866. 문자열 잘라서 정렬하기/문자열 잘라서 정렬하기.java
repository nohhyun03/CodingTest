import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String[] str_list = myString.split("x");
        for (String str : str_list)
            if (!str.equals(""))
                list.add(str);
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}