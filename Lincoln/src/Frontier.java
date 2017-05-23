public class Frontier {
	public static void main(String[] args)
	{
    String str = "Space, the final frontier.";
	String mutation1, mutation2, mutation3, mutation4;
	System.out.println("Original string: \"" + str + "\"");
	System.out.println("Length of string: " + str.length());
	//mutation1 = str.concat(", except from vending machines.");
	mutation1 = str.toUpperCase();
	mutation2 = mutation1.replace('E', 'X');
	mutation3 = mutation2.substring(7);
	//Print each mutated string
	System.out.println("Mutation #1: " + mutation1);
	System.out.println("Mutation #2: " + mutation2);
	System.out.println("Mutation #3: " + mutation3);
	//System.out.println("Mutation #4: " + mutation4);
	System.out.println("Mutated length: " + mutation3.length());
	}
	}

