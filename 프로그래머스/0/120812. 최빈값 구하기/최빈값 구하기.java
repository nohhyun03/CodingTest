class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        for (int num : array)
            count[num]++;
        int max_num = 0;
        int cnt = 1;
        for (int num = 1; num < count.length; num++){
            if (count[num] > count[max_num]){
                max_num = num;
                cnt = 1;
            } else if (count[num] == count[max_num]){
                cnt++;
            }         
        }
        return cnt == 1 ? max_num : -1;
            
    }
}