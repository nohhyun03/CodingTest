class Solution {
    public int solution(int a, int b) {
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        int result1 = Integer.parseInt(str_a+str_b);
        int result2 = Integer.parseInt(str_b+str_a);
        return result1 > result2 ? result1 : result2;
        
    }
}