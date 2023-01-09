import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		/*Keep the most specific conditions at the top,
		 *and the most generic ones towards the bottom.*/
		if((number % 3 == 0) && (number % 5 == 0)) {
			System.out.println("FizzBuzz");
		}
		else if(number % 5 == 0) {
			System.out.println("Fizz");
		}
		else if (number % 3 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(number);
		}
	}

}
