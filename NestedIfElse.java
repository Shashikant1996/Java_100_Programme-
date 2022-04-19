import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int passingMark,markObtained;
char Grade;
passingMark=40;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Marks");
markObtained=sc.nextInt();
if(markObtained>=passingMark) {
	 if(markObtained>=90)
		Grade='A';
	else if(markObtained>=75)
		Grade='B';
	else if(markObtained>=60)
		Grade='C';
	else
		Grade= 'D';
	System.out.println("You Passed The Exam and Your Grade is "+Grade);
}
else {
	Grade='F';
	System.out.println("You Failed and Your gradeis "+Grade);
}
	}

}
