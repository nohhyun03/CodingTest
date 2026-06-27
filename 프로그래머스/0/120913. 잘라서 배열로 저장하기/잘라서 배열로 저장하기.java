class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length()/n + (my_str.length()%n==0 ? 0 : 1);
        String[] result = new String[size];
        for (int i = 0; i < size; i++)
            result[i] = my_str.substring(n*i, Math.min(n*(i+1), my_str.length()));
        return result;
    }
}