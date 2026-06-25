class Solution {
    public int solution(String binomial) {
        String[] bio = binomial.split(" ");
        int a = Integer.parseInt(bio[0]);
        int b = Integer.parseInt(bio[2]);
        switch(bio[1]){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
        }
        return 1;
    }
}