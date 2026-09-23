class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int lrow = 3, lcol = 0;
        int rrow = 3, rcol = 2;
        for (int n : numbers) {
            char c;
            int nrow = n == 0 ? 3 : (n-1)/3;
            int ncol = n == 0 ? 1 : (n-1)%3;
            if (ncol == 0) c = 'L';
            else if (ncol == 2) c = 'R';
            else {
                int ldis = Math.abs(lrow - nrow) + Math.abs(lcol - ncol);
                int rdis = Math.abs(rrow - nrow) + Math.abs(rcol - ncol);
                if (ldis > rdis) c = 'R';
                else if (ldis < rdis) c = 'L';
                else if (hand.equals("left")) c = 'L';
                else c = 'R';
            }
            sb.append(c);
            if (c == 'L') {
                lrow = nrow;
                lcol = ncol;
            } else {
                rrow = nrow;
                rcol = ncol;
            }
        }
        return sb.toString();
    }
}