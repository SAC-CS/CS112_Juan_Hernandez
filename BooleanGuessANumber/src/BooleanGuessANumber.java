// Juan P Hernandez
// 09/24/2013
// Guess A Number Game

import java.util.Scanner;


public class BooleanGuessANumber {

	public static void main(String[] args)
		{
		
		int playCount = 0;
		boolean proceed = true;
		while (proceed){
		playCount ++;
		proceed = playCount < 999;
		
		int x = 0 + (int) ( Math.random() * 10 );
		Scanner input = new Scanner( System.in );

		System.out.println("Guess a number from 0-9: ");
		
		
		

		int y = input.nextInt();
		
		
		boolean win = x == y;
		boolean lower = x < y;
		
		
		

		if (win)
		{System.out.println("You are right!");}
			else {
				if (lower )
				{System.out.println("Too high guess a lower number");}
					else {
					{System.out.println("Too low guess a higher number");}
					
					System.out.println("Do you want to keep playing? yes = 1, no = 2");
					int no = input.nextInt();
					
					if (no == 2 )
					{proceed = false;}
					else {proceed = playCount < 9999;}
					
					
					
				
}
}
}
}
}