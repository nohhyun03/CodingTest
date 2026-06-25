class Solution {
    public int[] solution(String myString) {
        String[] str_list = (new StringBuilder(" "+ myString +" ")).toString().split("x");
        int[] count = new int[str_list.length];
        for (int i = 0; i < str_list.length; i++){
            count[i] = str_list[i].trim().length();
        }
        return count;
    }
}