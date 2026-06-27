class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        for (int num : array)
            for (char c : (num+"").toCharArray())
                if (c == '7') cnt++;
        return cnt;
    }
}