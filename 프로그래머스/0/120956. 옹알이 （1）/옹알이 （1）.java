class Solution {
    public int solution(String[] babbling) {
        String[] speaking = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        for (String str : babbling){
            for (String spk : speaking) {
                str = str.replace(spk, " ");
            }
            if (str.trim().equals("")) cnt++;
        }
        return cnt;
    }
}