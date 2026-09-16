class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;
        for (int i = 0; i < sizes.length; i++){
            if (max_w < Math.min(sizes[i][0],sizes[i][1]))
                max_w = Math.min(sizes[i][0],sizes[i][1]);
            if (max_h < Math.max(sizes[i][0],sizes[i][1]))
                max_h = Math.max(sizes[i][0],sizes[i][1]);
        }
        return max_w * max_h;
    }
}