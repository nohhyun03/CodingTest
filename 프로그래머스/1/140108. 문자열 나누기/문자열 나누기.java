class Solution {
    public int solution(String s) {
        int i = 0;
        int result = 0;
        while (i < s.length()) {
            int count = 1;
            int other = 0;
            int j = i + 1;
            while (count != other && j < s.length()) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
                else other++;
                j++;
            }
            i = j;
            result++;
        }
        return result;
    }
}