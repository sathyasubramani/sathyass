import java.util.Scanner;
public class number{
public static void main(String[] args){
int n;
System.out.println("enter an integer number:");
Scanner num=new Scanner (System.in);
n=num.nextInt(); 
if(n%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}
