package sssss;
import java.io.*;
import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the String");
		 String s=sc.nextLine();
		 String str1="";
	char p[]=s.toCharArray();
	char[] str=new char[s.length()];
	for(int k=0;k<s.length();k++){
		if(p[k]=='a'||p[k]=='e'||p[k]=='i'||p[k]=='o'||p[k]=='u'||p[k]=='A'||p[k]=='E'||p[k]=='I'||p[k]=='O'||p[k]=='U'){
			System.out.print(p[k]);
		}
		else{
			str1=p[k]+str1;
		}
	}
	System.out.print(str1);
			
	}
	}		 

	


