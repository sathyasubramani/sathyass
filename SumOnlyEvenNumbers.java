package sssss;

import java.util.Scanner;

public class SumOnlyEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
        	int a=n%10;
        	n=n/10;
        	if(a%2==0){
        	sum+=a;	
        	}
        }
        System.out.println(sum);
	}

}
