import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*Formatting Practice:
		 * String result = NumberFormat.getCurrencyInstance().format(0.1564);
		 * System.out.println(result);
		 */


		/*For Loop practice
		 * for (int i = 0; i < 5; 1++){
		 * 		System.out.println("Hell World" + (i+1));
		 * }
		 * */

		/* While loop practice
		 * int i = 0;
		 * while (i > 0){
		 * 		System.out.println("Hell World" + (i+1));
		 * 		i--l;
		 * }
		 * */

		/* Do while loop (find out if the user quit)
		 Scanner scanner = new Scanner(System.in);
		 String input = "";
		  while (!input.equals("quit")) {
		  		System.out.print("Input: " );
		 		input = scanner.next().toLowerCase();
		 		System.out.println(input);
		  }*/

		/*Scanner scanner = new Scanner(System.in);
		  String input = "";
		  do {
		  		System.out.print("Input: " );
		 		input = scanner.next().toLowerCase();

		 		if (input.equals("pass"))
		 			continue;
		 		if (input.equals("quit"))
		 			break;
		 		System.out.println(input);	
		  } while (true);*/

		/*For-Each-Loop Practice
		String[] fruits = {"Apple", "Mango", "Orange"};

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		//Forward counting only. 
		for (String fruit : fruits)
			System.out.println(fruit);
		
	}
}
