
package assignment;
import java.util.*;
public class Que1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1=0;
		int m2=0;
		int m3=0;
		int m4=0;
		int m5=0;

		while(m1 == 0) {
		System.out.print("Enter Science Marks: ");
		int tempm1 = sc.nextInt();
		if(tempm1 >= 101) {
		System.out.println("Please Enter Correct Marks");
		}
		else {
		m1= tempm1;
		}
		}

		while(m2 == 0) {
		System.out.print("Enter Maths Marks: ");
		int tempm2 = sc.nextInt();
		if(tempm2 >= 101) {
		System.out.println("Enter Correct Marks");
		}
		else {
		m2= tempm2;
		}
		}

		while(m3 == 0) {
		System.out.print("Enter English Marks: ");
		int tempm3 = sc.nextInt();
		if(tempm3 >= 101) {
		System.out.println("Enter Correct Marks");
		}
		else {
		m3= tempm3;
		}
		}

		while(m4 == 0) {
		System.out.print("Enter Geography Marks: ");
		int tempm4 = sc.nextInt();
		if(tempm4 >= 101) {
		System.out.println("Enter Correct Marks");
		}
		else {
		m4= tempm4;
		}
		}

		while(m5 == 0) {
		System.out.print("Enter History Marks: ");
		int tempm5 = sc.nextInt();
		if(tempm5 >= 101) {
		System.out.println("Enter Correct Marks");
		}
		else {
		m5= tempm5;
		}
		}

		System.out.println("Average: " +
		(m1 + m2 + m3 + m4 + m5) / 5);


		// By using lambda and stream API
		List<Integer> Marks = Arrays.asList(m1 , m2 , m3 , m4 , m5);
		Double y = Marks.stream().mapToInt(val -> val).average().getAsDouble();
		System.out.println("Average: " + y);



		}

		}
