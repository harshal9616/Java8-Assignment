package assignment;

interface A
{
void max(int a[]);
}

public class Que12 {

	public static void main(String[] args)
	{
	A maximum = (a) -> {
	int n = a.length;
	for(int i = 0 ; i < n ; i++)
	{
	for(int j = i + 1 ; j < n ; j++)
	{
	if(a[i] > a[j])
	{
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp ;
	}
	}
	}
	System.out.println("Maximum No : "+a[n - 1]);
	for(int k = 1 ; k <= 5 ; k++)
	{
	System.out.println(+k+" Largest no in an array = "+a[n-k]);
	}
	};

	int a[] = {10,15,5,90,45,65,83,12,23};
	maximum.max(a);
	}
	
	
}
