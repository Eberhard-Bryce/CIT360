package testing;
import java.util.Scanner;

public class JunitTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two numbers.\n");
		System.out.print("Number one is: ");
		int n1 = input.nextInt();
		
		System.out.print("Number two is: ");
		int n2 = input.nextInt();
	
		System.out.print("Now lets test these numbers!\n");
		
		System.out.print("Please tell me what " + n1 + " + " + n2 + " is: ");
		int n3 = input.nextInt();
		
		int addAnswer = addTest(n1, n2);
		int multiAnswer = multiTest(n1, n2);
		
		
if(n3 == addAnswer) {
	System.out.print("That is correct\n");
} else
	System.out.print("That is incorrect. The correct answer is " + addAnswer + "\n");

System.out.print("Now lets test these numbers again!\n");

System.out.print("Please tell me what " + n1 + " * " + n2 + " is: ");
int n4 = input.nextInt();

if(n4 == multiAnswer) {
		System.out.print("That is correct");
	} else
		System.out.print("That is incorrect. The correct answer is " + multiAnswer);

	}	

	public static int addTest(int n1, int n2) {
		return n1 + n2;
		
	}
		
	public static int multiTest(int n1, int n2) {
		return n1 * n2;
	}
	
	}

