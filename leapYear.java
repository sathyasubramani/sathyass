package sssss;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int y=sc.nextInt();
	/*for(int i=y;i<(y+20);i+=4){
		if((y%4==0)||(y%100==0)){
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}*/
	if(y%4==0){
		System.out.println("leap year");
	}
	for(int i=y;i<=(y+80);i++){
		if(i%4==0||i%100==0)
		System.out.println(i);
	}
	
}
	}


