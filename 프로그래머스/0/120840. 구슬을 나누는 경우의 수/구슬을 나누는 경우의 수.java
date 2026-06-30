class Solution {
    public int solution(int balls, int share) {
        int[][] com = new int[balls+1][share+1];
        for (int i = 0; i <= balls; i++){
            for (int j = 0; j <= Math.min(share,i); j++){
                if (i==0 || j==0) com[i][j] = 1;
                else {
                    com[i][j] = com[i-1][j] + com[i-1][j-1]; 
                }
            }
        }
        return com[balls][share];
    }
}