package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Que5 {

	public static void main(String[] args) 
	{

        List<String> Emp = Arrays.asList("Rahul", "Raj", "Akshay", "Omkar", "Anurag","Shreyash");
		Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
		Emp.stream()
		.max(compByLength)
		.ifPresent(
		longest -> System.out.println("\nThe Name Having Large No Of Characters: "  + longest));
		}
	
}
