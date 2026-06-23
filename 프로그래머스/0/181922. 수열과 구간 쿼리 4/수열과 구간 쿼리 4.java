class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length);
        
        for (int[] query : queries){
            int s = query[0], e = query[1], k = query[2];
            for (int i = s; i <= e; i++)
                result[i] += i%k == 0 ? 1 : 0;
        }
        return result;
    }
}