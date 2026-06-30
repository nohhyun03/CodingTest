class Solution {
    public int solution(int[][] dots) {
        double[][] slop = new double[dots.length][dots.length];
        for (int i = 0; i < dots.length-1; i++)
            for (int j = i+1; j < dots.length; j++)
                slop[i][j] = (double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
        if (slop[0][1] == slop[2][3] || slop[0][2] == slop[1][3] || slop[0][3] == slop[1][2]) return 1;
        return 0;
    }
}