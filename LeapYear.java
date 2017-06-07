import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out println("the given year is leap year or not");
int year=sc.nextInt();
if(year%4==0)
{
System.out.println("the leap year="+year);
}
else
{
System.out.println("not a leap year");
}
sc.close();
}
