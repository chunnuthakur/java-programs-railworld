package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIst_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(20);
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList3);

        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList3);
        System.out.println(arrayList4);

        arrayList1.add(12);
        arrayList1.add(12);
        arrayList1.add(34);

        arrayList2.add(12);
        arrayList2.add(12);
        arrayList2.add(34);

        System.out.println(arrayList1.equals(arrayList2));


        System.out.println(arrayList1.contains(12));
        System.out.println(arrayList1.containsAll(arrayList2));
//        System.out.println(arrayList1.removeAll(arrayList2));
        System.out.println(arrayList1);
//        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.retainAll(arrayList2));

    }
}
