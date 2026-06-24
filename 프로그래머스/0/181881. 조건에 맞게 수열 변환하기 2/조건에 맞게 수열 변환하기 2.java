class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int count = 0;
        do {
            x++;
            count = 0;
            for (int i = 0; i < arr.length; i++){
                int num = arr[i]; 
                if (num >= 50 && num%2==0) {
                    arr[i] /= 2; count++;
                }
                else if (num < 50 && num%2==1) {
                    arr[i] = arr[i]*2 + 1; count++;
                }
            }
        } while (count > 0);
        return x-1;
    }
}