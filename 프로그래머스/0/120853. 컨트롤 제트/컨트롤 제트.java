class Solution {
    public int solution(String s) {
        int last = 0;
        int sum = 0;
        for (String str : s.split(" ")) {
            if (str.equals("Z")) sum -= last;
            else {
                last = Integer.parseInt(str);
                sum += last; 
            }
        }
        return sum;
    }
}