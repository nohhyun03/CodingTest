class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' ') {
                k = 0;
                continue;
            }
            if (k % 2 == 0) arr[i] = Character.toUpperCase(arr[i]);
            else arr[i] = Character.toLowerCase(arr[i]);
            k++;
        }
        return new String(arr);
    }
}