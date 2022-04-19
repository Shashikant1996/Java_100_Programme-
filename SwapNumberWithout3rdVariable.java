import java.util.Scanner;

public class SwapNumberWithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter X");
x=sc.nextInt();
System.out.println("Enter y");
y=sc.nextInt();
System.out.println("Before Swapping " +x +" " +y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("Before Swapping " +x +" " +y);
	}

}
