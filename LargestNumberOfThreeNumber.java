import java.util.Scanner;

public class LargestNumberOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first Number ");
x=sc.nextInt();
System.out.println("Enter a second Number ");
y=sc.nextInt();
System.out.println("Enter a third Number ");
z=sc.nextInt();
if(x>y&&x>z) {
	System.out.println( x+" is a Largest Number");
}
else if(y>x&&y>z) {
	System.out.println(y+" is a Largest Number");
}
else if(z>x&&z>y) {
	System.out.println(z+" is a Largest Number");
	}
else {
	System.out.println("Entered number are  not Distinct");
}
	}
}
