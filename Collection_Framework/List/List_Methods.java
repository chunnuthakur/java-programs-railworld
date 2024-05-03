package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class List_Methods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(129);
        list.add(103);
        list.add(78);
        list.add(36);

        System.out.println(list);

        System.out.println(list.contains(12));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(5));
        System.out.println(list.remove(Integer.valueOf(12)));
        System.out.println(list.get(1));
        System.out.println(list.set(1,56));
        System.out.println(list);
    }
}
