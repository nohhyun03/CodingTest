class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++){
            result[i] = check(quiz[i]);
        }
        return result;
    }
    
    public String check(String poly){
        String[] terms = poly.split(" ");
        switch(terms[1]){
            case "+":
                return Integer.parseInt(terms[0]) + Integer.parseInt(terms[2]) == Integer.parseInt(terms[4]) ? "O" : "X";
            case "-":
                return Integer.parseInt(terms[0]) - Integer.parseInt(terms[2]) == Integer.parseInt(terms[4]) ? "O" : "X";
        }
        return "";
    }
}