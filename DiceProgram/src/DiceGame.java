        public class DiceGame {
    	public static void main(String[] args) {
    		System.out.println("ITS TIME TO PLAY 41!!");
    		System.out.println();
    		
    		// Description and Initializing the variables and creating the objects.
    		int rollCount = 0, rollSum = 0;
    		Dice dice1 = new Dice(6), dice2 = new Dice(6);
    		
    		// Repetitions or loop structure
    		do{
    			
    			// calling roll methods of Die class using die1 and die2 reference variables.
    			dice1.roll();
    			dice2.roll();
    			//Declaration and Initialization of rollSum.
    			rollSum += dice1.getUpValue() + dice2.getUpValue();
    			//Increment of rollCount and printing the Number of rolls in an sequential order.
    			rollCount++;
    			System.out.print("Roll #"+ rollCount+":");
    			
    			// Display Roll Values when they are doubles
    			if (dice1.getUpValue() == dice2.getUpValue())
    				
    				System.out.println(dice1.getUpValue() + " " + dice2.getUpValue()+" DOUBLES!!! " + "Your total is: " + rollSum);
    			else
    				//Display roll values and their total scores
    				System.out.println(dice1.getUpValue() + " " + dice2.getUpValue()+" " + "Your total is: " + rollSum);
    			
    			
    			
    	        // Game Rules or giving the conditions to player they lose if their roll amount or total equals 10,20,30,or 40
    			if (rollSum == 10 || rollSum == 20 || rollSum == 30 || rollSum == 40 )
    			{
    				System.out.println("TOO BAD! YOU LOSE!");
    				break;
    			}
    			//If a total sum reaches 41 or more, the person wins the game.
    			else if (rollSum >= 41)
    				System.out.println("YOU ARE A WINNER!!");
    			System.out.println();
    			//if you roll the 2 dices 6 times, if a total sum is less than “41”, you lose the game.
    		}while (rollSum <= 41);
    	}
    }