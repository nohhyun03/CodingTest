class Solution {
    public int solution(String my_string) {
        String[] numbers = my_string.split("[a-zA-Z]");
        int sum = 0;
        for (String num : numbers)
            if (!num.equals("")) 
                sum += Integer.parseInt(num);
        return sum;
    }
}