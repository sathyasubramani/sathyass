package mariaprogram;
import java.util.Arrays;
import java.util.Scanner;
public class Heightlong {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,i;
		t=in.nextInt();
		int a[]=new int[t];
		System.out.println(t);
		for(i=0;i<t;i++)
		{
			a[i]=in.nextInt();
		}
	
			Arrays.sort(a);
	System.out.println(a[t-5]);
	}
}
