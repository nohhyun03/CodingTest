class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[arr1.length];
        for (int i = 0; i < n; i++){
            String binary = Integer.toString((arr1[i] | arr2[i]), 2);
            while (binary.length() < n)
                binary = "0" + binary;
            result[i] = binary.replace("0", " ").replace("1", "#");
        }
        return result;
    }
}