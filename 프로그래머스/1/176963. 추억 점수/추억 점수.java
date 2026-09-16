import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<String> list = new ArrayList<>();
        for (String n : name)
            list.add(n);
        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++){
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++){
                int idx = list.indexOf(photo[i][j]);
                if (idx != -1) sum += yearning[idx];
            }
            result[i] = sum;
        }
        return result;
    }
}