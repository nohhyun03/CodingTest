class Solution {
    public int solution(int a, int b) {
        int i = 1;
        while (i <= Math.min(a,b)){
            if (a%i==0 && b%i==0){
                a /= i;
                b /= i;
            }
            i++;
        }
        while (true){
            if (b%5==0) b /= 5;
            else if (b%2==0) b /= 2;
            else break;
        }
        return b == 1 ? 1 : 2;
    }
}