class Solution {
    public int solution(String[] babbling) {
        String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] can = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for (int i = 0; i < babbling.length; i++){
            for (String word : cant){
                babbling[i] = babbling[i].replace(word, "1");
            }
            for (String word : can){
                babbling[i] = babbling[i].replace(word, " ");
            }
            if (babbling[i].replace(" ", "").equals("")) {
                count++;
            }
        }
        return count;
    }
}