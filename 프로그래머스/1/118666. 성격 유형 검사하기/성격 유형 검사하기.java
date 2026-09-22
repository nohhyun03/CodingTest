import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"RT", "CF", "JM", "AN"};
        Map<Character, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str.charAt(0), 0);
            map.put(str.charAt(1), 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char select = survey[i].charAt(choices[i] / 4);
            //이번 설문에서 대상 문자 셀렉
            map.put(select, map.get(select) + Math.abs(4 - choices[i]));
            //선택에 따라 점수 계산 후 증가
        }
        for (String str : arr) {
            if (map.get(str.charAt(0)) >= map.get(str.charAt(1)))
                sb.append(str.charAt(0));
            else sb.append(str.charAt(1));
        }        
        return sb.toString();
    }
}