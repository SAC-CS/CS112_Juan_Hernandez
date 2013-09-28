// Juan P Hernandez
// 09/28/2013
// Rock Paper Scissors game

import java.util.Scanner;

public class RockPaperScissors {

	public static void main (String[]args)
	{
		
		// Get input from players
		Scanner input = new Scanner( System.in );
		
		System.out.println("Player A, enter R for Rock, P for Paper, or S for Scissors: ");
		String playerA = input.next();
		playerA = playerA.toUpperCase();
		System.out.println("Player B, enter R for Rock, P for Paper, or S for Scissors: ");
		String playerB = input.next();
		playerB = playerB.toUpperCase();
	
		// Process
		
		if (playerA.equals(playerB))
			{System.out.println("It's a tie!!");}
		else 
			if (playerA.equals("R")){
				if(playerB.equals("P"))
				{System.out.println("Paper beats Rock, Player B Wins!!");}
				else 
					if (playerB.equals("S")){
						{System.out.println("Rock beats Scissors, Player A Wins!!");}}
				}
			if (playerA.equals("P")){
				if(playerB.equals("R"))
				{System.out.println("Paper beats Rock, Player A Wins!!");}
				else 
					if (playerB.equals("S")){
						{System.out.println("Scissors beats Paper, Player B Wins!!");}}
				}
			if (playerA.equals("S")){
				if(playerB.equals("P"))
				{System.out.println("Scissors beats Paper, Player A Wins!!");}
				else 
					if (playerB.equals("R")){
						{System.out.println("Rock beats Scissors, Player B Wins!!");}}
									
					
		}
	}
}

					
			
	
	
	



