class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        int[] tCount = new int[10];
        StringBuilder sb = new StringBuilder();
        for (char num : X.toCharArray()) {
            xCount[num-'0']++;
        }
        for (char num : Y.toCharArray()) {
            yCount[num-'0']++;
        }
        for (int i = 0; i < 10; i++){
            tCount[i] = Math.min(xCount[i], yCount[i]);
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < tCount[i]; j++) {
                sb.append(Integer.toString(i));
            }
        }
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}