import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to Calculate Factorial ");
n=sc.nextInt();
if(n<0) 
	System.out.println("The Number Should Not Be Zero");

else {
	for(c=1;c<=n;c++) 
		fact=fact*c;
		System.out.println("Factorial of Given number is "+fact);
	
}
	}

}
