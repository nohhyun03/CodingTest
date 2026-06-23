class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int j = 0;
        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int ans = -1;
            for (int i = s; i <= e; i++)
                if(arr[i] > k && (ans == -1| ans > arr[i])) ans = arr[i];
            result[j++] = ans;
        }
        return result;
    }
}