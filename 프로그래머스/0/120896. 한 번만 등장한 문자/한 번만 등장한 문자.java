class Solution {
    public String solution(String s) {
        int[] cnt = new int[26];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            cnt[c-'a']++;
        for (int i = 0; i < cnt.length; i++)
            if (cnt[i] == 1) sb.append((char)(i+'a'));
        return sb.toString();
    }
}