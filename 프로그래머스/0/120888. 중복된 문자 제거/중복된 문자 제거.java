class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char a : my_string.toCharArray())
            if (sb.indexOf(a+"") == -1) sb.append(a); 
        return sb.toString();
    }
}