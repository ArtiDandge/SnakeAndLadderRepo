public class SnakeAndLadder {

	
	// Function to roll a dice and get number between 1-6
	public static int rollDice() {
		int dicevalue = (int) Math.floor(Math.random()*6) + 1;
		return dicevalue;
	}
	
	//Function to check Player get a Ladder or snake or player play or not
	public static int checkOption() {
		return (int) Math.floor(Math.random()*3) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print Welcome Message
		System.out.println("Welcome to Snake And Ladder Simulator Program");
		//Variables
		int Player1Position = 0;
		int Player2Position = 0;
		int PlayGame1 = 0;
		int PlayGame2 = 0;
		int WinPosition= 100;

		while(Player1Position !=100 || Player2Position !=100) {
			int Player1Dice = rollDice();   //player roll dice to get number
			PlayGame1++;
			System.out.println("Player1 Dice:"+Player1Dice);
			int Player2Dice = rollDice();
			System.out.println("Player2 Dice:"+Player2Dice);
			PlayGame2++;
			int option = checkOption(); //player check for options
			
			// Use Switch case for option
			switch (option) {
				case 1:
					System.out.println("Players not play");
					break;
				case 2:
					System.out.println("Player got the Ladder");
					Player1Position += Player1Dice;
					Player2Position += Player2Dice;
					if (Player1Position > WinPosition) {
						Player1Position -= Player1Dice;
					}else if (Player2Position > WinPosition) {
						Player2Position -= Player2Dice;
					}
					System.out.println("Player1 position is now "+Player1Position);
					System.out.println("Player2 postion is now "+Player2Position);
					break;
				case 3:
					System.out.println("Oops! Player got the Snake");
					if ( (Player1Position - Player1Dice) < 0) {
                    	Player1Position = 0;
                	} else {
                    	Player1Position -= Player1Dice;
                	}
					if ( (Player2Position - Player2Dice) < 0) {
                    	Player2Position = 0;
                	} else {
                    	Player2Position -= Player2Dice;
                	}
					System.out.println("Player1 position is now "+Player1Position);
					System.out.println("Player2 postion is now "+Player2Position);
					break;
				default:
					System.out.println("Something went Wrong");
					break;	
			}
		// check the condition which player has won the game.
		if(Player1Position == WinPosition || Player2Position == WinPosition)
			if(Player1Position == WinPosition) {
				
				System.out.println("----------Player1 won !----------");
				System.out.println("Number of times dice was played to win the game: "+PlayGame1);
				break;
			}else if(Player2Position ==  WinPosition) {
				System.out.println("----------Player2 won !----------");
				System.out.println("Number of times dice was played to win the game: "+PlayGame2);
				break;
			}
		 }
	}

}