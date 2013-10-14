// Juan P Hernandez
// 09/24/2013
// Guess A Number Game

import java.util.Scanner;


public class BooleanGuessANumber {

	public static void main(String[] args)
		{
		
		// input
		Scanner input = new Scanner( System.in );
		int x = 0 + (int) ( Math.random() * 10 );
		
		int playCount = 0;
		int playerWins = 0;
		int computerWins = 0;
		int userMoveNo = 0;
		int computerMoveNo = 0;
		int userMoves [] = new int[25];
		int computerMoves [] = new int[25];
		
		System.out.println("Guess a number from 0-9 or if you want to stop playing type <Ctrl> z");
		
		while (input.hasNext()){
		
		int y = input.nextInt();
		
		if (x == y)
		{System.out.println("You are right!");
		playCount = playCount +1;
		playerWins = playerWins + 1;}
		else
		if (x < y )
		{System.out.println("Too high guess a lower number");
		playCount = playCount +1;
		computerWins = computerWins + 1;}
		else
		if (x > y)
		{System.out.println("Too low guess a higher number");
		playCount = playCount +1;
		computerWins = computerWins + 1;}
		
		// array
				 userMoves[userMoveNo] = y;
				 computerMoves[computerMoveNo] = x;
				 userMoveNo++;
				 computerMoveNo++;
		
		} // end while
		
		if (playCount != 0)
		{
			System.out.printf("\nTotal number of games tries: %d\n\n", playCount);
		}
		
		// array output
		for ( userMoveNo = 0; userMoveNo < userMoves.length; userMoveNo++)
		{System.out.println("User moves: " + userMoves[userMoveNo]);}
			
		for ( computerMoveNo = 0; computerMoveNo < computerMoves.length; computerMoveNo++)
		{System.out.println("Computer moves: " + computerMoves[computerMoveNo]);}
		
		if (playerWins > computerWins)
		{System.out.println("Player Wins\n");}
		if (computerWins > playerWins)
		{System.out.println("Computer Wins\n");}
		if (playerWins == computerWins)
		{System.out.println("It's a tie\n");}
		
}
}
