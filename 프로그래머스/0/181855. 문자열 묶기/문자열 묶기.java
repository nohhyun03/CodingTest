class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for (String str : strArr){
            count[str.length()]++;
        }
        int max = count[1];
        for (int i = 2; i < count.length; i++)
            if (count[i] > max) max = count[i];
        return max;
    }
}