package assignment;

public class Que9 {

	
	public static void main(String[] args) {
		//size of array n = 15;
		int array[] = {11,32,63,76,83,1,7,19,55,34,23,54,45,96,16};
		int n = array.length;

		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < n; i++)
		{
		if (array[i] % 2 == 0)
		evenSize++;
		else
		oddSize++;
		}
		System.out.print("Count Of Even Numbers In An Array : "+evenSize+"\n");
		System.out.print("Count Of Odd Numbers In An Array: "+oddSize);
		}
}
