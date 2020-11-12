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
		int Player1Position = 0;
		//repeat till win position i.e. till 100
		while(Player1Position !=100) {
			int Player1Dice = rollDice();   //player roll dice to get number
			int option = checkOption(); //player check for options
			
			// Use Switch case for option
			switch (option) {
				case 1:
					System.out.println("Players not play");
					break;
				case 2:
					System.out.println("Player got the Ladder");
					Player1Position += Player1Dice;
				
					break;
				case 3:
					System.out.println("Oops! Player got the Snake");
					if ( (Player1Position - Player1Dice) < 0) {
                    	Player1Position = 0;
                	} else {
                    	Player1Position -= Player1Dice;
                	}
				
					break;
				default:
					System.out.println("Something Wrong");
					break;	
			}
		}	
	}

}