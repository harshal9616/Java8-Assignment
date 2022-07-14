package assignment;

public class Que2 {

	static void print(int arr[], int n)
	{
	for (int i = 0; i < n; i++)
	{
	int j;
	for (j = 0; j < i; j++)
	if (arr[i] == arr[j])
	break;

	if (i == j)
	System.out.print( arr[i] + " ");
	}
	}

	public static void main(String[] args)
	{
	int arr[] = {2,4,6,8,2,6,8,10,4,2,6,10,8,3};
	int n = arr.length;
	print(arr, n);

	}
	}
	

