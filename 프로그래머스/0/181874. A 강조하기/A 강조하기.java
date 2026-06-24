class Solution {
    public String solution(String myString) {
        char[] str = myString.toCharArray();
        for (int i = 0; i < str.length; i++){
            if (str[i] == 'a' || str[i] == 'A') str[i] = 'A';
            else str[i] = Character.toLowerCase(str[i]);
        }
        return new String(str);
    }
}