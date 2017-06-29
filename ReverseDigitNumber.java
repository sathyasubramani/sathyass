package sir;

import java.util.Scanner;

public class ReverseDigitNumber {

	public static void main(String[] args) {
	int rev,s=0;
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
int i=sc.nextInt() ;
   while(i>0){
	   rev=i%10;
	   s=(s*10)+rev;
	   i=i/10;
   }
   System.out.println("reverse"+s);
	}
}
