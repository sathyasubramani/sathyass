import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array key");
		int k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int bb=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(k!=0){
				b[i]=a[n-k];
				k--;
			}
			else{
				break;
			}
			 bb=i;
		}
int c=0;
for(int i=bb+1;i<n;i++){
	b[i]=a[c];
	c++;
	
}
for(int i=0;i<n;i++){
	System.out.print(b[i]+" ");
}
	}

}
