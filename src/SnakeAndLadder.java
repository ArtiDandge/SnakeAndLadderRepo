
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
				int Player1Dice = rollDice();   //player roll dice to get number
				
	}

}
