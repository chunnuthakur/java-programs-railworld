package CollectionFramework1;
import java.util.ArrayList;
// Main.java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args)
	{
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
		List<Integer> even_num = num.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		List<Integer> odd_num = num.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
 
		
		System.out.println("Original Set of numbers: "+num);
		System.out.println("Even numbers: " + even_num);
		System.out.println("Odd numbers: "+ odd_num);
	}
}
