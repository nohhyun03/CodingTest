class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;
        while(count <= 500){
            if (n == 1) return count;
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            count++;
        }
        return -1;
    }
}