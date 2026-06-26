import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Set<Integer> set = new HashSet();
        int[] count = new int[7];
        set.add(a); count[a]++;
        set.add(b); count[b]++;
        set.add(c); count[c]++;
        set.add(d); count[d]++;
        if (set.size() == 1) return a*1111;
        else if (set.size() == 4){
            return Math.min(Math.min(Math.min(a,b),c),d);
        } else if (set.size() == 3){
            int result = 1;
            for (int i = 1; i < count.length; i++)
                if (count[i] == 1) result *= i;
            return result;
        } else {
            for (int i = 0; i < count.length; i++){
                if (count[i] == 2)
                    for (int j = i+1; j < count.length; j++)
                        if (count[j] == 2) return j*j - i*i;
                if (count[i] == 3)
                    for (int j = 0; j < count.length; j++)
                        if (count[j] == 1) return (10*i + j)*(10*i + j);
            }
        }
        return 1;
    }
}