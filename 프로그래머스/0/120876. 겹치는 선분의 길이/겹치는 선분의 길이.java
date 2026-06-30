class Solution {
    public int solution(int[][] lines) {
        int[] mark = new int[201];
        for (int[] line : lines)
            for (int i = line[0]; i < line[1]; i++)
                mark[i+100]++;
        int cnt = 0;
        for (int i = 0; i < mark.length; i++)
            if (mark[i] > 1) cnt++;
        return cnt;
    }
}