package sir;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		StringBuffer str1=new StringBuffer(s);
		StringBuffer str2=new StringBuffer(str1);
		str1.reverse();
		System.out.println("orginal :"+str2);
		System.out.println("reverse :"+str1);
		

	}

}
