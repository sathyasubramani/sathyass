import java.io.*;
import java.util.Scanner;
class Natural
{
public static void main(String args[])
{
int x,i=1;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("sum of natural numbers");
x=sc.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("the sum of natural number"+sum);
}
}
