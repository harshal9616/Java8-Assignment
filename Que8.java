package assignment;


@FunctionalInterface
interface i1
{
void check(int a);
}

public class Que8 {

	public static void main(String[] args) {

		i1 oddEven=new i1()
		{
		public void check(int a) {
		if(a%2==0)
		{
		System.out.println("Number " +a+ " is even");
		}
		else
		{
		System.out.println("number " +a+ " is odd");
		}
		}
		};

		oddEven.check(101);
		oddEven.check(130);


		}
	
}
