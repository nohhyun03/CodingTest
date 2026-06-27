class Solution {
    public int solution(int order) {
        String od = order+"";
        return od.replaceAll("[^369]", "").length();
    }
}