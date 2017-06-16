public class Palindrome {
public static void main(String args[]){
	int no = 121,rem,rev=0;
	int oo=no;
	while(no>0){
		rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}
	if(oo==rev){
		System.out.println("the given no is palindrome");
	}
	else{
		System.out.println("the given no is not a palindrome");

	}
}
}
