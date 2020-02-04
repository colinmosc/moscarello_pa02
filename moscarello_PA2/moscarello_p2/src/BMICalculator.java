import java.util.Scanner;
public class BMICalculator {	
	private static Scanner in = new Scanner(System.in);
	private int weight;
	private int height;
	private float BMI;
	private String bmiCat;
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}
	
	//collects the unit type and measurements
	public void readUserData() {
		int unit = readUnitType();
		readMeasurementData(unit);
	}
	
	//calculate bmi
	public void calculateBmi() {
		BMI = (float)getWeight()/getHeight();
		calculateBmiCategory(getBmi());
	}
	
	//display bmi and bmi category
	public void displayBmi() {
		System.out.printf("Your BMI is %.1f\n", BMI);
		System.out.print(getBmiCategory());
	}
	
	//get weight
	public int getWeight() {
		return weight;
	}
	
	//set weight and check for a negative
	private void setWeight(int weight) {
		if (weight < 0) {
			System.exit(0);
		}
		this.weight = weight;
	}
	
	//get height
	public int getHeight() {
		return height;
	}
	
	//set height and check for a negative
	private void setHeight(int height) {
		if (height < 0) {
			System.exit(0);
		}
		this.height = height;
	}
	
	//get BMI
	public float getBmi() {
		return BMI;
	}
	
	//get BMI category
	public String getBmiCategory() {
		return bmiCat;
	}
	
	//determine whether imperial or metric
	private int readUnitType() {
		System.out.print("Would you like to use imperial or metric units? (i or m)");
		String unit = in.nextLine();
		//make sure input is valid
		while (unit.equals("i") == false && unit.equals("m") == false) {
			System.out.print("Invalid entry, please enter 'i' for imperial or 'm' for metric.");
			unit = in.nextLine();
		}
		//imperial
		if (unit.equals("i") == true) {
			return 1;
		}
		//metric
		if (unit.equals("m") == true) {
			return 2;
		}
		return 0;
	}
	
	//collect specific measurements in terms of unit
	private void readMeasurementData(int unit) {
		if (unit == 1) {
			readImperialData();
		}
		if (unit == 2) {
			readMetricData();
		}
		
	}
	
	//ask and collect data in terms of metric
	private void readMetricData() {
		System.out.print("Please enter your weight in kilograms: ");
		weight = in.nextInt();
		setWeight(weight);
		System.out.print("Please enter your height in meters: ");
		height = in.nextInt();
		setHeight(height * height);
	}
	
	//ask and collect data in terms of imperial
	private void readImperialData() {
		System.out.print("Please enter your weight in pounds: ");
		weight = in.nextInt();
		setWeight(703 * weight);
		System.out.print("Please enter your height in inches: ");
		height = in.nextInt();
		setHeight(height * height);
	}

	//determine bmi category
	private String calculateBmiCategory(float bmi) {
		if (bmi < 18.5) {
			//System.out.println("You are underweight.");
			bmiCat = "Underweight.";
			return bmiCat;
		}
		if (bmi >= 18.5 && bmi <= 24.9) {
			//System.out.println("You have a normal weight.");
			bmiCat = "Normal weight.";
			return bmiCat;
		}
		if (bmi >= 25 && bmi <= 29.9) {
			//System.out.println("You are overweight.");
			bmiCat = "Overweight.";
			return bmiCat;
		}
		if (bmi >= 30) {
			//System.out.println("You are obese");
			bmiCat = "Obese.";
			return bmiCat;
		}
		return "";
	}
	
	
} //end of program
