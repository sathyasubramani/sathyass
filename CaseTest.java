package sssss;

import java.util.Scanner;

public class CaseTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		String str="";
	
		for(int i=0;i<s.length();i++){
			char a=s.charAt(i);
		    if(Character.isLowerCase(a)){
			str=s.toUpperCase();
		    }
			else{
				str=s.toLowerCase();
			}
		}
		System.out.println(str);
	}

}
