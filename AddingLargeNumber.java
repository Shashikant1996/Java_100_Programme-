import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a First Large Number");
num1=sc.nextLine();
System.out.println("Enter a Second Large Number");
num2=sc.nextLine();
BigInteger first= new BigInteger(num1);
BigInteger second=new BigInteger(num2);
BigInteger sum;
sum=first.add(second);
System.out.println("Result Addition= "+sum);
	}

}
