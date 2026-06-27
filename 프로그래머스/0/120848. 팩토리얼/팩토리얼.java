class Solution {
    public int solution(int n) {
        int fac = 1;
        int i = 1;
        while(fac*i <= n){
            fac *= i;
            i++;
        }
        return i-1;
    }
}