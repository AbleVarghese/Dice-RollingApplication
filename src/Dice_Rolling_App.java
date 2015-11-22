
/*
Program: Rolling Dice Application
Program Description: The system rolls two dice 36000 times and gets the sum of them each time. It counts all the occurrence of sums 
these of the two dices which will range from 2-12, and displays the number of occurrences of each of those sums when the dices are rolled 36000 times. 

Name: Able Varghese
Student No: 300 806 936
 */

import java.util.Random;

public class Dice_Rolling_App {

	// Declaring and initializing the instance variables
	int ran1, ran2, ranSum;
	int[] sumArray = new int[12];
	int[] sumRepeat = new int[12];
	Random Dice1 = new Random();
	Random Dice2 = new Random();

	public Dice_Rolling_App() {

		// Initialize sumArray
		for (int i = 0; i < 11; i++) {

			sumArray[i] = i + 2;

		}

		// Initializing sumRepeat array
		for (int j = 0; j < 11; j++) {

			sumRepeat[j] = 0;

		}

		// Calling the dice rolling logic
		dice_Rolling_Logic();
	}

	// Implementing the dice rolling logic
	void dice_Rolling_Logic() {

		for (int n = 0; n < 36000; n++) {

			ran1 = 1 + Dice1.nextInt(6);
			ran2 = 1 + Dice2.nextInt(6);
			ranSum = ran1 + ran2;

			for (int m = 0; m < 35; m++) {
				if (sumArray[m] == ranSum) {
					sumRepeat[m]++;
					break;
				}
			}
		}

		// Printing the result array (sumRepeat)
		for (int k = 0; k < 11; k++) {
			System.out.println("Total number of occurance of sum:" + sumArray[k] + " is = " + sumRepeat[k]);
		}

	}
}
