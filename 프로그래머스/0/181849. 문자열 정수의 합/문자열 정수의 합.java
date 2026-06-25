class Solution {
    public int solution(String num_str) {
        char[] num_arr = num_str.toCharArray();
        int sum = 0;
        for (char num : num_arr){
            sum += num - '0';
        }
        return sum;
    }
}