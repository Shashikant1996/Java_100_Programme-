import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int passingMark,markObtained;
passingMark=40;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Mark");
markObtained=sc.nextInt();
if(markObtained>=passingMark) {
	System.out.println("You Succcesfully passsed Exam");
}
else {
	System.out.println("Unfortunately you failed Exam");
}
	}

}
