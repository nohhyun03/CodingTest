class Solution {
    public int solution(int[] ingredient) {
        int[] stk = new int[ingredient.length];
        int top = 0;
        int result = 0;
        for (int igr : ingredient) {
            stk[top++] = igr;
            if (top >= 4 &&
               stk[top-4] == 1 && stk[top-3] == 2 &&
               stk[top-2] == 3 && stk[top-1] == 1) {
                result++;
                top -= 4;
            }
        }
        return result;
    }
}