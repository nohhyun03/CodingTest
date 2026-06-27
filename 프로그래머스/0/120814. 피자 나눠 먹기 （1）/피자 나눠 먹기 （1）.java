class Solution {
    public int solution(int n) {
        int count = 1;
        while(7*count < n)
            count++;
        return count;
    }
}