import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int count = 0;
        while(true){
            Arrays.sort(wallet);
            Arrays.sort(bill);
            if (wallet[1] < bill[1] || wallet[0] < bill[0]) 
                bill[1] /= 2;
            else break;
            count++;
        }
        return count;
        
            
    }
}