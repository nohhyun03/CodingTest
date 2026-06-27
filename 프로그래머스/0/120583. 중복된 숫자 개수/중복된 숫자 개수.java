class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        for (int num : array)
            if (num == n) cnt++;
        return cnt;
    }
}