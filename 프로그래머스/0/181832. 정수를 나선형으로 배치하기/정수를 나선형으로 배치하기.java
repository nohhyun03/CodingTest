class Solution {
    public int[][] solution(int n) {
        int[][] map = new int[n+2][n+2];
        for (int i = 0; i < n+2; i++)
            for (int j = 0; j < n+2; j++){
                if (i == 0 || j == 0 || i == n+1 || j == n+1)
                    map[i][j] = 1;
            }
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int num = 1;
        int i = 1, j = 1;
        int now = 0;
        int[] direct = directions[now];
        while (num <= n*n){
            map[i][j] = num++;
            if (map[i + direct[0]][j + direct[1]] != 0){
                direct = directions[(++now)%4];
            }
            i += direct[0];
            j += direct[1];            
        }
        int[][] answer = new int[n][n];
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                answer[i][j] = map[i+1][j+1];
            }
        }
        return answer;
    }
}