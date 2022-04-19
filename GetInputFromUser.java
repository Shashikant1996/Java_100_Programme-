import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		float b;
		String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
s=sc.nextLine();
System.out.println(" You Entered String "+s);
System.out.println("Enter an integer");
a=sc.nextInt();
System.out.println(" You Entered integer "+a);
System.out.println("Enter a Float");
b=sc.nextFloat();
System.out.println("You Entered float "+b);
	}

}
