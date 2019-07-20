import java.util.*;
public class Funmatrix 
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
		for(j=0;j<n;j++)
		{
			System.out.print((i+j)%n);
		}
		System.out.println("");
		}
	}
}