package CollectionFramework;

import java.util.Queue;
import java.util.*;

public class Deq {
	public static void  main(String args[]) {
		
		
		Deque  q = new LinkedList();
		
		q.addFirst(89);
		q.offerFirst(54);
		
		
		q.removeFirst();
		System.out.println(q);
		
	    q.pollFirst();
	    System.out.println(q);
	    
	 //   q.removeFirst();
	    
	    q.addLast(98);
	    q.addLast(78);
	    
	  System.out.println(q.peekLast());
	  q.removeLast();

	  System.out.println(q.getLast());
	    System.out.println(q);
		
		
	
	}

}
