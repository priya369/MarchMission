import java.util.Scanner;

public class Pallendrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int t=n;
	int sum=0;
	while(n!=0) {
		
		sum=sum*10+(n%10);
		n=n/10;
	}
	if(sum==t) {
		System.out.println("yes number is not pallendrome");
	}
	else {
		System.out.println("Number is not pallendrome");
	}
}
}
