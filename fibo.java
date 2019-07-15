import java.util.*;
class fibo
{
	public static void main(String args[])
	{
		int i,f=0,f1=1,n,sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find fibonacci: ");
		n=s.nextInt();
		System.out.println(f);
		for(i=0;i<=n;i++)
		{
			System.out.println("Fibbonacci Series is: "+f);
			sum=f+f1;
			f=f1;
			f1=sum;
		}
	}
}