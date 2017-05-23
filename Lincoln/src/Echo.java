import java.util.Scanner;

public class Echo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of Text:");
		message = scan.nextLine();
		System.out.println("You Entered:\"" + message + "\"");

	}

}
