class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        for (String key : keyinput){
            int dx = 0, dy = 0;
            switch(key){
                case "up": dy = 1; break;
                case "down": dy = -1; break;
                case "left": dx = -1; break;
                case "right": dx = 1; break;
            }
            if (Math.abs(x+dx) <= board[0]/2 && Math.abs(y+dy) <= board[1]/2){
                x += dx;
                y += dy;
            }
        }
        return new int[]{x, y};
    }
}