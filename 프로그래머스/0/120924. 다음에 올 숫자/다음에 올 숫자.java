class Solution {
    public int solution(int[] common) {
        if (common[2] + common[0] == 2*common[1])
            return common[common.length-1] + common[1] - common[0];
        else 
            return common[common.length-1]*common[1]/common[0];
    }
}