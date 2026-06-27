class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            sum += '9' - c >= 0 ? c - '0' : 0;
        }
        return sum;
    }
}