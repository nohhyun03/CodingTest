class Solution {
    public int solution(int[] num_list) {
        if (num_list.length > 10){
            int sum = 0;
            for (int num : num_list){
                sum += num;
            }
            return sum;
        } else {
            int pro = 1;
            for (int num : num_list){
                pro *= num;
            }
            return pro;
        }
    }
}