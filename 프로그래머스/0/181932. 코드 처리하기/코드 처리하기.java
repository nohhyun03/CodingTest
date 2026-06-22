class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < code.length(); i++){
            if (code.charAt(i) == '1'){
                mode = (mode + 1)%2;
                continue;
            } 
            if (i % 2 == mode) ret.append(code.charAt(i));
        }
        return ret.length() != 0 ? ret.toString() : "EMPTY";
    }
}