package assignment;

import java.util.ArrayList;
import java.util.List;

public class Que11 {

	
	public static void main(String[] args) {



		List<Integer> nos = new ArrayList<Integer>();
		nos.add(107);
		nos.add(405);
		nos.add(96);
		nos.add(56);
		nos.add(235);
		nos.add(345);




		System.out.println("Find any no in parallel stream");
		nos.stream().parallel().filter(n -> n > 300).findAny().ifPresent(System.out::println);

		}
}

