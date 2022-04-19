import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter X ");
x=sc.nextInt();
System.out.println("Enter Y");
y=sc.nextInt();
System.out.println("Before Swapping = "+x+" " +y);
temp=x;
x=y;
y=temp;
System.out.println("After Swapping = "+x+" "+y);
	}

}
