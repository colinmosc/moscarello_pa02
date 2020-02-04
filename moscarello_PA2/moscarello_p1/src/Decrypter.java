import java.util.Scanner;

public class Decrypter {
	
	static void decrypt() {
		//ask user for number
		System.out.print("Please enter the four digit number you'd like to decrypt: ");
		//get number
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		//load number into an array
		int[] numArray = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			numArray[i] = num.charAt(i) - '0';
		}
		//perform decryption
		int temp = numArray[0];
		int temp2 = numArray[1];
		numArray[0] = numArray[2];
		numArray[2] = temp;
		numArray[1] = numArray[3];
		numArray[3] = temp2;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] - 7 > -1) {
				numArray[i] -= 7;
			}
			else {
				numArray[i] += 3;
			}
		}
		//display decrypted number
		System.out.print("Your decrypted four digit number is ");
		for (int i : numArray) {
			System.out.print(i);
		}
	}
}
