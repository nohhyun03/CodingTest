class Solution {
    public int[] solution(int[][] score) {
        int[] rank_list = new int[score.length];
        for (int i = 0; i < score.length; i++){
            int rank = 1;
            for (int j = 0; j < score.length; j++){
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1])
                    rank++;
            }
            rank_list[i] = rank;
        }
        return rank_list;
    }
}