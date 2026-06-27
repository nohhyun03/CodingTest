import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : numbers) list.addLast(num);
        switch(direction){
            case "right": list.addFirst(list.removeLast()); break;
            case "left": list.addLast(list.removeFirst()); break;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}