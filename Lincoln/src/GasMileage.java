import java.util.Scanner;

public class GasMileage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int miles;
		double gallons,mpg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of miles: ");
		miles = scan.nextInt();
		System.out.println("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		mpg = miles/ gallons;
		System.out.println("Miles per Gallon: " + mpg);
		

	}

}
