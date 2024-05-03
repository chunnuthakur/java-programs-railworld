package CollectionFramework1;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {
	
	public static void main(String args[]) {
		
	//	System.out.println("helo");
		
		Set<Integer> set = new HashSet    <>();
		
		set.add(1000);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		System.out.println(set.contains(21));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
//		

		
	}

}
