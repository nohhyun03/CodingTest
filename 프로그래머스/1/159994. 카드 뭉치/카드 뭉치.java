class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0;
        for (String word: goal){
            if (i < cards1.length && cards1[i].compareTo(word) == 0) i++;
            else if (j < cards2.length && cards2[j].compareTo(word) == 0) j++;          else return "No";
        }
        return "Yes";
    }
}