class Solution {
    public int solution(int[][] dots) {
        int ax = dots[0][0], bx = 0;
        int ay = dots[0][1], by = 0;
        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] != ax) bx = dots[i][0];
            if (dots[i][1] != ay) by = dots[i][1];
        }
        return Math.abs(ax-bx)*Math.abs(ay-by);
    }
}