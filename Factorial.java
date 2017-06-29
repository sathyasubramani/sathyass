package sir;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int fact=1;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		for(int i=1;i<=s;i++){
			 fact=fact*i;
		}
System.out.println("fact"+fact);
	}

}
