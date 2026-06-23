class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] str = my_string.toCharArray();
        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            while(s <= e){
                char temp = str[s];
                str[s] = str[e];
                str[e] = temp;
                s++; e--;
            }
        }
        return new String(str);
    }
}