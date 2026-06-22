class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        String op = ineq+eq;
        switch(op){
            case ">=": answer = n >= m; break;
            case "<=": answer = n <= m; break;
            case ">!": answer = n > m; break;
            case "<!": answer = n < m; break;
        }
        return answer ? 1 : 0;
    }
}