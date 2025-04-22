import java.util.Random;
import java.util.Scanner;
public class ScissorGame{
	public static void main(String[] args) {
	Random computerInput = new Random();
	Scanner input = new Scanner(System.in);

	int computer = (int) ((Math.random() *2) + 0);

	int counter = 0;
	int numWins = 0;
	int computerWins = 0;

	int scissor = 0;
	int rock = 1;
	int paper = 2;
	int different = 0;

	while(counter != 5) {
	System.out.println("scissor(0), rock(1), paper(2)");
	System.out.print("Guess my number between 0 and 2: ");
	int num = input.nextInt();

		if (computer == scissor && num == rock) {
		System.out.println("You win.");
	}
		if (computer == rock && num == scissor) {
		System.out.println("You lose");
	}
		if (computer == paper && num == rock) {
		System.out.println("You lose");
	}
		if (computer == rock && num == paper) {
		System.out.println("You win");
	}
		if (computer == paper && num == scissor) {
		System.out.println("You win");
	}
		if (computer == scissor && num == paper) {
		System.out.println("You win");
	}
		if (computer == num) {
		System.out.println("Draw Draw");
	}
		counter = counter + 1; 
}
		
		if (numWins % 2 == 0) {
		System.out.print("\n You win");

}		else {
		System.out.print("\n computer win");

}


}
}