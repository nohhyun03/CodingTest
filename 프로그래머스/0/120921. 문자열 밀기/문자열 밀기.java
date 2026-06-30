class Solution {
    public int solution(String A, String B) {
        if (B.equals(A)) return 0;
        for (int i = 1; i < A.length(); i++){
            if (B.equals(A.substring(A.length()-i, A.length())+A.substring(0, A.length()-i)))
                return i;
        }
        return -1;
    }
}