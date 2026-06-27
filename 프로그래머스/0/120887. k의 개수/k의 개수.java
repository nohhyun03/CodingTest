class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for (int num = i; num <= j; num++)
            for (char c : (num+"").toCharArray())
                if (c - '0' == k) cnt++;
        return cnt;
    }
}