import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c;
BigInteger inc=new BigInteger("1");
BigInteger fact=new BigInteger("1");
Scanner sc=new Scanner(System.in);
System.out.println("Input an integer");
n=sc.nextInt();
for(c=1;c<=n;c++) {
	fact=fact.multiply(inc);
	inc=inc.add(BigInteger.ONE);
	
}
System.out.println(n+"! ="+fact);
	}

}
