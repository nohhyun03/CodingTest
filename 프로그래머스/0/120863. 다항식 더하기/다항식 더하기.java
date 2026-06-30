class Solution {
    public String solution(String polynomial) {
        int[] result = new int[2];
        for (String term : polynomial.split(" ")){
            if (term.equals("x")) result[0] += 1;
            else if (term.contains("x")) result[0] += Integer.parseInt(term.replace("x", ""));
            else if (term.equals("+")) continue;
            else result[1] += Integer.parseInt(term);
        }
        if (result[0] == 0) return result[1]+"";
        else return ((result[0]==1)?"x":(result[0]+"x")) + ((result[1]==0) ? "":" + "+(result[1]));
    }
}