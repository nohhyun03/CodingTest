import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> list = new ArrayList<>(List.of("code", "date", "maximum", "remain"));
        int j = list.indexOf(ext);
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][j] < val_ext)
                count++;
        }
        int[][] result = new int[count][4];
        int k = 0;
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][j] < val_ext) {
                System.arraycopy(data[i], 0, result[k++], 0, data[i].length);
            }
        }
        
        j = list.indexOf(sort_by);
        for (int i = 0; i < result.length-1; i++) {
            int min = i;
            for (k = i+1; k < result.length; k++) {
                if (result[k][j] < result[min][j])
                    min = k;
            }
            int[] temp = new int[4];
            System.arraycopy(result[min], 0, temp, 0, 4);
            System.arraycopy(result[i], 0, result[min], 0, 4);
            System.arraycopy(temp, 0, result[i], 0, 4);
        }
        return result;
        
        
    }
}