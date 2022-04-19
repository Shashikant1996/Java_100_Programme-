import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
x=sc.nextInt();
if(x%2==0) {
	System.out.println(x+ " Is a Even Number");
}
else {
	System.out.println(x+ " Its a Odd number");
}
	}

}
