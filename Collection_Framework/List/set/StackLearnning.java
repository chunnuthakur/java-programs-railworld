package CollectionFramework1;
import java.util.*;
public class StackLearnning {

	
	public static void main(String args[]) {
		
		int arr[] = {10,20,30,40};
		
		System.out.println(Arrays.toString(arr));
		
		Stack<String> animals= new Stack<>();
		
		animals.push("cat");
		animals.push("lion");
		animals.push("dog");
		animals.push("tiger");
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		
		System.out.println(animals.pop());
		System.out.println(animals);
		
		System.out.println(animals.empty());
		System.out.println(animals.search(4));
	}
}
