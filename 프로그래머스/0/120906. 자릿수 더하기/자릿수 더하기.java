class Solution {
    public int solution(int n) {
        String num = n+"";
        int sum = 0;
        for (char c : num.toCharArray())
            sum += c - '0';
        return sum;
    }
}