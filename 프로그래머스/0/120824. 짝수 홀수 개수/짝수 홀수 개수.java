class Solution {
    public int[] solution(int[] num_list) {
        int even_cnt = 0, odd_cnt = 0;
        for (int num : num_list){
            if (num%2 == 0) even_cnt++;
            else odd_cnt++;
        }
        return new int[]{even_cnt, odd_cnt};
    }
}