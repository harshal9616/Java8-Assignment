package assignment;

import java.util.Arrays;
import java.util.List;
public class Que4 {
    
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,2,4,6,7,1,12,4500,11,3,9);
		int n = (int) num.stream().mapToInt(val -> val).max().getAsInt();
		System.out.println("Maximum No:"+n);
		}
		}

