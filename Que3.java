package assignment;

import java.util.*;
import java.util.stream.Collectors;


public class Que3 {

	public static void main(String[] args) {


		Collection <String> emp= Arrays.asList("Rahul", "Ajinkya", "Akshay", "Amit", "Raj", "Akshay","Rahul","Akshay" );

		List<String> empDistinct = emp.stream()
		.distinct()
		.collect( Collectors.toList() );
		System.out.println(empDistinct );

		}
		}

