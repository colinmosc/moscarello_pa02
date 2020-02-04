import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		//ask user for input
		System.out.print("Would you like to encrypt or decrypt a four digit number? (type e or d) ");
		//get input
		Scanner input = new Scanner(System.in);
		String yesNo = input.nextLine();
		//make sure input is valid
		while (yesNo.equals("e") == false && yesNo.equals("d") == false) {
			System.out.print("Invalid entry, please enter 'e' for encrypt or 'd' for decrypt.");
			yesNo = input.nextLine();
		}
		//call encrypt
		if (yesNo.equals("e") == true) {
			Encrypter.encrypt();
		}
		//call decrypt method
		if (yesNo.equals("d") == true) {
			Decrypter.decrypt();
		}
	}
}
