import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float temperature;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a temperature in Fahrenheit");
temperature=sc.nextFloat();
temperature=((temperature-32)*5)/9;
System.out.println("Temperature in celsius "+temperature);
	}

}
