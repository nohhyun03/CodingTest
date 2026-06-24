class Solution {
    public int[] solution(String my_string) {
        int[] count = new int[52];
        for (int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c >= 'a') count[c - 'a' + 26]++;
            else count[c - 'A']++;   
        }
        return count;
    }
}