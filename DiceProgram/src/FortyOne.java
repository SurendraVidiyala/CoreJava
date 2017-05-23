public class FortyOne{
    	/**
    	 * @param args
    	 */
    	public static void main(String [] args){
    		
    		
    		Dice dice1, dice2;
    			
    		//Create a pair of dice
    		dice1 = new Dice(6);	
    		dice2 = new Dice(6);
    		
    		//Rolls dice
    		dice1.roll();
    		dice2.roll();
    		int rollCount;
    		rollCount = 0;
    		
    		rollCount++;
    		
    		//Initiate game	
    		System.out.println("Let's Play 41!!!");
    		System.out.print("Roll #"+ rollCount+"  ");
    		rollCount++;
    		
    		// After the roll, prints out the value of die1 & 2.
    		System.out.print(dice1.getUpValue() + "  ");
    		System.out.print(dice2.getUpValue() + "  ");
    		
    		//if you get doubles
    		if (dice1.getUpValue() == dice2.getUpValue())
    			System.out.print("YOU GOT DOUBLES!!!   ");
    		
    	
    		//Gives turn total
    		int turnTotal = dice1.getUpValue()+ dice2.getUpValue();
    		//prints out sum of die1 and die2
    		System.out.print("Your total is: " + turnTotal+  "  ");
    		
    		
    		
    		//Adds turnTotal to the next ?????
    		int playerTotal =0;
    		playerTotal+=turnTotal;
    	
    		
    		//gives the wining number
    
			@SuppressWarnings("unused")
			int winner = 41;
    		
    		
    		//Limits the amount of rolls to 6.
    		if(rollCount >=7)
    		System.out.println("YOU LOSE!!");
    		
    		//Tells player they lose if their roll amount or total equals 10,20,30,or 40
    		if(turnTotal == 10 || turnTotal == 20 || turnTotal == 30 || turnTotal == 40){
    			System.out.println("\n" +" AW!! You lose! Sorry!");}
    		else if(playerTotal == 10 || playerTotal == 20 || playerTotal == 30 || playerTotal == 40){
    			System.out.println("\n" +" AW!! You lose! Sorry!");}
    			else 		
    			
    		do {
    			System.out.print("\n" + "Roll #"+ rollCount+"  ");
    			rollCount++;	
    			dice1.roll();
    			dice2.roll();
    			dice1.getUpValue();
    			dice2.getUpValue();
    			System.out.print(dice1.getUpValue() + "  ");
    			System.out.print(dice2.getUpValue() + "  ");
    			System.out.print("Your total is: " + (turnTotal)+  "  ");
    		} while (rollCount<=6);
    rollCount++;	
    	
    	}
    	
    }
