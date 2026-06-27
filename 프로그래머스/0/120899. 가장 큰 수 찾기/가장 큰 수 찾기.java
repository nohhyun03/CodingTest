class Solution {
    public int[] solution(int[] array) {
        int max_idx = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max_idx = i;
                max = array[i];
            }
        }
        return new int[]{max, max_idx};
    }
}