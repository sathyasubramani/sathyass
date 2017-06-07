import java.io.*;
import java.util.Scanner;
class Char{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in)
System.out.println("Enter the char");
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println(entered character "+ch+" is alphabet);
else
System.out.println(entered character "+ch+" is not an alphabet);
}
sc.close;
}
