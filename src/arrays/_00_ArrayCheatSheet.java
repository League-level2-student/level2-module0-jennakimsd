package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stuff = new String[5];
		//2. print the third element in the array
		System.out.println(stuff[3]);
		//3. set the third element to a different value
		stuff[3]= "nick";
		//4. print the third element again
		System.out.println(stuff[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
		
		//6. make an array of 50 integers
		int[] cool = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for (int i = 0; i < cool.length; i++) {
			cool[i]= randy.nextInt(51);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int low = Integer.MAX_VALUE;
		for (int i = 0; i < cool.length; i++) {
			if (cool[i]< low) {
				low = cool[i];
			}
		}
		System.out.println(low);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(cool));
		//10. print the largest number in the array.
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < cool.length; i++) {
			if (cool[i]> high) {
				high= cool[i];
			}
		}
		System.out.println(high);
	}
}
