class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (String od : order){
            if (od.contains("americano") || od.contains("anything")) sum += 4500;
            else if (od.contains("cafelatte")) sum += 5000;
        }
        return sum;
    }
}