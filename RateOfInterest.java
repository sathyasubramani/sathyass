package sssss;

import java.util.Scanner;

public class RateOfInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
        int amount=sc.nextInt();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        System.out.println("simple Interest ="+(amount*rate*time));
	}

}
