// Juan P Hernandez
// 09/28/2013
// Rock Paper Scissors game HW06

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main (String[]args)
	{
		int playerWinsCounter = 0;
		int computerWinsCounter = 0;
		int playerComputerTies = 0;
		int games = 1;
		int round = 1;
		
		
		String gamesString = 
				JOptionPane.showInputDialog("How many games to do you want to play?");
		games = Integer.parseInt(gamesString);
		
		while (round <= games)
		{
		round ++;
		
		int playerComputer = 1 + (int) ( Math.random() * 3 );
		
		
		String playerAString =
				JOptionPane.showInputDialog("\nPlayer, enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
		int playerA = Integer.parseInt(playerAString);
		
		if (playerA == playerComputer)
			{String messageOne = String.format("It's a tie!!");
			JOptionPane.showMessageDialog(null, messageOne);
			playerComputerTies = playerComputerTies + 1;}
		else 
		if (playerA == 1 && playerComputer == 2)
			{String messageTwo = String.format("Paper beats Rock, Computer Wins!!");
			JOptionPane.showMessageDialog(null, messageTwo);
			computerWinsCounter = computerWinsCounter + 1;}
		else 
		if (playerA == 1 && playerComputer == 3)
			{String messageThree = String.format("Rock beats Scissors, You Win!!");
			JOptionPane.showMessageDialog(null, messageThree);
			playerWinsCounter = playerWinsCounter + 1;}
		else 
		if (playerA == 2 && playerComputer == 1)
			{String messageFour = String.format("Paper beats Rock, You Win!!");
			JOptionPane.showMessageDialog(null, messageFour);
			playerWinsCounter = playerWinsCounter + 1;}
		else 
		if (playerA == 2 && playerComputer == 3)
			{String messageFive = String.format("Scissors beat Paper, Computer Wins!!");
			JOptionPane.showMessageDialog(null, messageFive);
			computerWinsCounter = computerWinsCounter + 1;}
		else 
		if (playerA == 3 && playerComputer == 1)
			{String messageSix = String.format("Rock beats Scissors, Computer Wins!!");
			JOptionPane.showMessageDialog(null, messageSix);
			computerWinsCounter = computerWinsCounter + 1;}
		else 
		if (playerA == 3 && playerComputer == 2)
			{String messageSeven = String.format("Scissors beat Paper, You Win!!");
			JOptionPane.showMessageDialog(null, messageSeven);
			playerWinsCounter = playerWinsCounter + 1;}
		
		} // end while
		
		
		String totalWins = String.format("\nPlayer wins: %d\nComputer wins: %d\nTies: %d\n", 
				playerWinsCounter, computerWinsCounter, playerComputerTies);
		JOptionPane.showMessageDialog(null, totalWins);
		
		
		if (playerWinsCounter > computerWinsCounter)
		{String playerWinsMessage = String.format("\nPlayer wins this match");
			JOptionPane.showMessageDialog(null, playerWinsMessage);}
		
		if (computerWinsCounter > playerWinsCounter)
		{String computerWinsMessage = String.format("\nComputer wins this match");
			JOptionPane.showMessageDialog(null, computerWinsMessage);}
		
		if (computerWinsCounter == playerWinsCounter)
		{String tieMessage = String.format("\nNo one wins, it was a tie");
			JOptionPane.showMessageDialog(null, tieMessage);}
}
}
	
	



