class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] new_list = new int[size+1];
        System.arraycopy(num_list, 0, new_list, 0, size);
        new_list[size] = num_list[size-1] > num_list[size-2] ? num_list[size-1] - num_list[size-2] : 2*num_list[size-1];
        return new_list;
    }
}