import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int n = nums[len-1] + nums[len-2] + nums[len-3];
        
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
    
        isPrime[0] = false;
        isPrime[1] = false;
    
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < len-2; i++)
            for (int j = i+1; j < len-1; j++)
                for (int k = j+1; k < len; k++)
                    if (isPrime[nums[i]+nums[j]+nums[k]])
                        count++;
        return count;
    }
}