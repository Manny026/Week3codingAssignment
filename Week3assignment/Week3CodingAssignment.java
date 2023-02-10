package Week3assignment;

import java.util.Arrays;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
		// Question 1a,1b & 1c
     int[] age = {3,9,23,64,2,8,28,93};
     
     int lengthOfArr = age.length;
     int firstAndLast = Math.abs(age[lengthOfArr - lengthOfArr]-age[lengthOfArr - 1]);
     
     System.out.println("Question 1.a is: " + firstAndLast);
     
     int[] newAge = new int[age.length];
     
     System.arraycopy(age, 0, newAge, 0, age.length);
     
     lengthOfArr = newAge.length;
     newAge[lengthOfArr - 1]=100;
     firstAndLast = Math.abs(newAge[lengthOfArr - lengthOfArr]- newAge[lengthOfArr-1]);
		System.out.println("Question 1.b is: " + firstAndLast);
		
		int sum = 0;
		for (int i = 0; i < newAge.length; i++) {
			sum += newAge[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("Question 1.c is: " + average );
		System.out.println("\n");
		
		// Question 2.a & 2.b
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("Questions 2.a is: " + average);
		
		String allNames = " ";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println("Question 2.b is:" + allNames + "\n");
		
		// Questions 3 & 4
		System.out.println("Question 3: To access last element of an array is [arr.length]");
		System.out.println("Questions 3: To access the first element of an array is using [0]");
		System.out.println("\n");
		//Questions 5
		int[] nameLengths = new int[names.length];
		for (int i=0; i < names.length;i++) {
			nameLengths[i]= names[i].length();
		}
		// Questions 6
		sum = 0;
		for (int i = 0; i < nameLengths.length;i++) {
			sum += nameLengths[i];
		}
		System.out.println("Question 6 is: " + sum );
		System.out.println("\n");
		
        // Question 9	
		System.out.println(duplicateWord("Manny",3) + "\n");
		System.out.println(fullName("Manny","Peralta")+ "\n");
		System.out.println("Question 9: " + GreaterThen100(age));
		System.out.println("\n");
		
		// Question 10
		double[] doubleArr = {0.1,1.0,236,4592,1000.1};
		System.out.println("Question 10: " + averageDoubleArr(doubleArr));
		System.out.println("\n");
		// Question 11
		double[] anotherDoubleArr = {2.2,3.3,4.4,5.5};
		System.out.println("question 11: " + firstArrIsGreater(doubleArr,anotherDoubleArr));
		System.out.println("\n");
		// questions 12
		System.out.println("Question 12: " + willBuyDrink(true,15.0));
		System.out.println("\n");
		
		
		// Question 13, My method is to calculate miles to and Alert when to fill up and should print True if miles are low.
		System.out.println("low on Gas! Time to fill up!  " + fillUpGasTank(true,20));
		
		
		}
	
	public static String duplicateWord(String word, int n) {
		String duplicateWord = "";
		for(int i =0; i < n; i++) {
			duplicateWord += word;
		}
		return "Question 7: " + duplicateWord;
	}
	public static String fullName(String firstName,String lastName) {
		return "Question 8: " + firstName + " " + lastName;
	}
	public static boolean GreaterThen100 (int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	public static double averageDoubleArr(double[] arr) {
		
		return Arrays.stream(arr).average().orElse(0);
	}
	public static boolean firstArrIsGreater(double[] firstArr, double[] secondArr) {
		return averageDoubleArr(firstArr) > averageDoubleArr(secondArr);
	}
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	
	}
	public static boolean fillUpGasTank(boolean gasTank,int miles) {
		if (gasTank && miles < 25) {
		return true;
	} else {
		return false;
	}

}
}
