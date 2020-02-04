import java.util.Scanner;
public class Encrypter {
	
	static void encrypt(){
		//ask user for number
		System.out.print("Please enter the four digit number you'd like to encrypt: ");
		//get number
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		//load number into an array
		int[] numArray = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			numArray[i] = num.charAt(i) - '0';
		}
		//perform encryption
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = (numArray[i] + 7) % 10;
		}
		int temp = numArray[0];
		int temp2 = numArray[1];
		numArray[0] = numArray[2];
		numArray[2] = temp;
		numArray[1] = numArray[3];
		numArray[3] = temp2;
		//display encrypted number
		System.out.print("Your encrypted four digit number is ");
		for (int i : numArray) {
			System.out.print(i);
		}
	}
}
