package assignment;

import java.util.ArrayList;


public class MainQue6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ItemQue6> I=new ArrayList<ItemQue6>();
		I.add(new ItemQue6(1,"iphone",80000));
		I.add(new ItemQue6(2,"ipad",40000));
		I.add(new ItemQue6(3,"Macbook",90000));
		I.add(new ItemQue6(3,"iwatch",90000));



		double n = (double) I.stream().mapToDouble(obj -> obj.itemprice).average().getAsDouble();
		System.out.println("Average price:"+n);

		System.out.println("Price Less Than Average:");
		I.stream().filter(p ->p.itemprice< n)
		.map(pm ->pm.itemprice) // fetching price
		.forEach(System.out::println); // iterating price
}
}
