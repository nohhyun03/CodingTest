class Solution {
    public int solution(int[][] board, int[] moves) {
        int[] stack = new int[1000];
        int top = 0;
        int count = 0;
        for (int col : moves) {
            col--; //열번호
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] != 0) {
                    stack[top++] = board[row][col];
                    board[row][col] = 0;
                    break;
                }
                //만약 찾지 못하면 push못함
            }
            //push한 이후 pop가능 여부 조사
            if (top >= 2 && stack[top-1] == stack[top-2]) {
                top -= 2;
                count += 2;
            }
        }
        return count;
    }
}