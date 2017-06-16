public class Count {
public static void main(String args[]){
	int no=1234,count=0;
	while(no>0){
		no=no/10;
		count=count+1;
	}
	System.out.println("the count of the integer = "+count);
}
}
