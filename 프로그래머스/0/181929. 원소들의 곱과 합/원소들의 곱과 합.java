class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sop = 0;
        for(int num : num_list){
            product *= num;
            sop += num;
        }
        sop = sop*sop;
        return product < sop ? 1 : 0; 
    }
}