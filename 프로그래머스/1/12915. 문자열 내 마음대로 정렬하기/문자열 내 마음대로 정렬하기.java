class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length-1; i++) {
            int min = i;
            for (int j = i+1; j < strings.length; j++) {
                if (strings[min].charAt(n) == strings[j].charAt(n)) {
                    if (strings[min].compareTo(strings[j]) > 0)
                        min = j;
                } else if (strings[min].charAt(n) > strings[j].charAt(n)) {
                    min = j;
                }
            }
            String temp = strings[i];
            strings[i] = strings[min];
            strings[min] = temp;
        }
        return strings;
    }
}