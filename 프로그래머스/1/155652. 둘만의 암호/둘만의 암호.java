class Solution {
    public String solution(String s, String skip, int index) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            char ch = arr[i];
            while(count < index){
                ch = (char)((ch + 1 - 'a') % 26 + 'a');
                if (skip.contains(""+ch)) continue;
                else count++;
            }
            arr[i] = ch;
        }
        return new String(arr);
    }
}