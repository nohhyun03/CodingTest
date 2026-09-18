class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;
        int zero = 0;
        for (int i = 0; i < 6; i++){
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < 6; j++){
                if (lottos[i] == win_nums[j]) {
                    same++;
                    break;
                }
            }
        }
        int max_rank = Math.min(7 - (same + zero), 6);
        int min_rank = Math.min(7 - same, 6);
        return new int[]{max_rank, min_rank};
    }
}