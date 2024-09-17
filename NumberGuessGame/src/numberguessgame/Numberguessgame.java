package numberguessgame;

import java.util.Random;
import java.util.Scanner;

public class Numberguessgame {

	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomnumber = rand.nextInt(100) + 1;
		int trycount = 0;
		//System.out.println("The random number is " +randomnumber);
		
		System.out.println("Enter your guess range number between 1 to 100 ");

		while(true) {
		int playerGuess = scanner.nextInt();
		trycount++;
		
		if (playerGuess < 0 || playerGuess > 100) 
		{
			System.out.println("Invalid input ! Please enter the number ranging between 1 to 100");
			continue;
		}

		if(playerGuess == randomnumber)
		{
			System.out.println("Correct Guess You Win !");
			System.out.println("It took you " + trycount + " tries");
			break;
		}
		else if(randomnumber > playerGuess) 
		{
			System.out.println("Nope ! The number is higher. Please Guess Again");
		}
		else 
		{
			System.out.println("Nope ! The number is lower. Please Guess Again");
		}
		}
		scanner.close();
	}

}
