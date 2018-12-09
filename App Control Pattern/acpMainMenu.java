package ACP;

import java.util.Scanner;

public class acpMainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter either rock, paper, or scissors to see what your choice beats and loses to, in a game of rock, paper, scissors)");
AppController app = new AppController();
app.dispatchRequest(input.next());
	}

}
