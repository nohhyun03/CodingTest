class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        while (n >= a) {
            int get_count = n / a * b;
            sum += get_count;
            n = n % a + get_count;
        }
        return sum;
    }
}