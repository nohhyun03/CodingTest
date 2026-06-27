class Solution {
    public int solution(int num, int k) {
        String str = num+"";
        return str.indexOf(k+"") != -1 ? str.indexOf(k+"") + 1 : -1;
    }
}