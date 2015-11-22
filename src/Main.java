/*
Program:Contains an 'Airline Ticket Reservation Application' and 'Dice Rolling Application'

Program Description: This class calls two application as you choose them.
It contains an Airline ticket reservation Applicaiton and Dice Rolling Application

Name: Able Varghese
Student No: 300 806 936
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int select = 0;

		while (select != 3) {
			System.out.println("\n*************************************************");
			System.out.println(
					"\nPlease make your choice between Applications. \n\n1. Rolling Dice App. \n2. Airline Reservation System\n3. Exit\n");
			System.out.println("*************************************************");
			select = scan.nextInt();

			if (select == 1) {
				Dice_Rolling_App Obj1 = new Dice_Rolling_App();
				select = 0;

			}

			else if (select == 2) {
				Airline Flight = new Airline();
				select = 0;
			} else if (select == 3) {
				System.out.println("\nExiting the system......");
				return;
			}

			else {
				System.out.println("\nPlease enter choice No. 1 or choice No. 2, or choice No. 3");

			}
		}

	}
}
