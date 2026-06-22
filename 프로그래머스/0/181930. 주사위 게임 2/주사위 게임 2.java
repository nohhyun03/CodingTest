import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        Set<Integer> set = new HashSet();
        set.add(a);
        set.add(b);
        set.add(c);
        switch(set.size()){
            case 1: answer *= a*a*a + b*b*b + c*c*c;
            case 2: answer *= a*a + b*b + c*c;
            case 3: answer *= a + b + c;
        }
        return answer;
    }
}