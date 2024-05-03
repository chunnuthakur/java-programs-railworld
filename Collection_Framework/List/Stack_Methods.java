package Collection_Framework.List;

import java.util.Arrays;
import java.util.Stack;

public class Stack_Methods {
    public static void main(String[] args) {
        Stack<Float> stack = new Stack<>();
        stack.push(1f);
        stack.push(12f);
        stack.push(13f);
        stack.push(55f);
        stack.push(5f);
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.search(45));

        stack.add(34f);
        stack.add(45f);
        System.out.println(stack);
        stack.remove(34f);
        stack.addAll(Arrays.asList(1f,2f,3f,4f,5f,6f,7f,8f,9f,10f));
        System.out.println(stack);
    }
}
