package Collection_Framework.List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_Methods {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("12");
        linkedList.add("45");
        linkedList.add("78");
        linkedList.add("67");
        linkedList.add("45");
        linkedList.add("677");
        linkedList.add(null);

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(12, 34, 56, 13, 345));

//        linkedList.remove(5);
//        System.out.println(linkedList.get(3));
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());
//        System.out.println(linkedList.remove("677"));
//        System.out.println(list1.remove(Integer.valueOf(12)));
//        System.out.println(list1);
        System.out.println(linkedList);

    }
}
