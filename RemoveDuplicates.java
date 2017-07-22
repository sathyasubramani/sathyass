import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String b=sc.nextLine();
	
		String a=new String();
        for(int i=0;i<b.length();i++){
      	if(!a.contains(String.valueOf(b.charAt(i)))) 
        {
                    a += String.valueOf(b.charAt(i));
        }
        		}
        	
        System.out.println(a); 
	}

}
