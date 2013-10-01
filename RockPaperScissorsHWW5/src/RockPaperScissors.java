// Juan P Hernandez
// 09/28/2013
// Rock Paper Scissors game

import java.util.Scanner;

public class RockPaperScissors {

	public static void main (String[]args)
	{
		int round = 0;
		while (round < 15){
		round ++;
		
		// Get input from players
		int playerComputer = 1 + (int) ( Math.random() * 3 );
		Scanner input = new Scanner( System.in );
		
		System.out.println("Player, enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
		int playerA = input.nextInt();
		
		
		// Process
		
		if (playerA == playerComputer)
			{System.out.println("It's a tie!!");}
		else 
			if (playerA == 1 && playerComputer == 2)
				{System.out.println("Paper beats Rock, Computer Wins!!");}
				else 
					if (playerA == 1 && playerComputer == 3)
						{System.out.println("Rock beats Scissors, You Win!!");}
						
						else 
							if (playerA == 2 && playerComputer == 1)
								{System.out.println("Paper beats Rock, You Win!!");}
							else 
								if (playerA == 2 && playerComputer == 3)
									{System.out.println("Scissors beat Paper, Computer Wins!!");}
								else 
									if (playerA == 3 && playerComputer == 1)
										{System.out.println("Rock beats Scissors, Computer Wins!!");}
									else 
										if (playerA == 3 && playerComputer == 2)
											{System.out.println("Scissors beat Paper, You Win!!");}
		
	}
}
}
					
			
	
	
	



