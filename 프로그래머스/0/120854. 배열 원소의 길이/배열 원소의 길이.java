class Solution {
    public int[] solution(String[] strlist) {
        int[] lengthlist = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++)
            lengthlist[i] = strlist[i].length();
        return lengthlist;
    }
}