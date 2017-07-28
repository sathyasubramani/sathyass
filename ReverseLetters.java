import java.util.Scanner;


public class ReverseLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++){
				StringBuffer str=new StringBuffer(a[i]);
				str.reverse();

			System.out.print(str);
		}
        
	}

}
