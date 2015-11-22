
/*
Program: Airline Reservation Application
Program Description: An airline has one flight. Flight has 10 seats. The first 5 are First Class seats, 
and 6th to 10th seats are Economy seats. This is the Airline Reservation Application that reserve seats 
for its passengers based on their needs.

Name: Able Varghese
Student No: 300 806 936
 */

import java.util.Scanner;

//Airline class
class Airline {
	public boolean[] firstClassSeats = new boolean[5];
	public boolean[] economySeats = new boolean[5];
	Scanner scan = new Scanner(System.in);

	// Constructor of Airline Class
	Airline() {
		Menu();
		return;
	}

	// Menu method where the program directs and help reserve seats in
	// appropriate sections.
	public void Menu() {
		int choice = 0;

		int counter = 0;

		for (int index = 0; index < 5; index++) {
			firstClassSeats[index] = false;
			economySeats[index] = false;
		}

		while (choice != 3) {
			counter += 1;
			System.out.print("****************************************");
			System.out.print("\n1. First Class\n2. Economy\n3. Exit\n");
			System.out.println("****************************************");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				FirstClassSeatReservation();

				break;
			case 2:
				EconomySeatReservation();

				break;

			case 3: {
				System.out.println("\nExiting the airline reservation system......");
				return;
			}

			default:
				System.out.println("\nInvalid input. Please make a correct selection.....\n");
				break;
			}
		}
	}

	// This method reserve economy seats if they are available.
	public void EconomySeatReservation() {
		int indexSeatNo = 6;
		int index2 = 0;
		while (index2 < 5) {
			// System.out.println("{0}a",indexSeatNo);
			if (economySeats[index2] == false) {
				economySeats[index2] = true;
				System.out.println(
						"You have successfully reserved economy class ticket, your seat number is " + indexSeatNo);
				return;
			}
			index2 += 1;
			indexSeatNo += 1;

		}
		System.out.println("Sorry, economy class has no more seats left.\n\n");

		int x = SeatsFullMethod();

		if (x == 5) {
			System.out.println("Sorry, the seats are full, Next flight is in 3 hours");
			return;
		} else {

			System.out.print(" Would you like to reserve seat in first class? please type in yes/no: ");
			String changeClass = scan.next();
			if (changeClass == "yes" || changeClass == "YES") {
				FirstClassSeatReservation();

			}
			if (changeClass == "no" || changeClass == "NO") {
				return;
			}
		}
	}

	// This method reserve first class seats if they are available.
	public void FirstClassSeatReservation() {
		int index = 1;
		int loopIndex = 0;
		while (loopIndex < 5) {
			if (firstClassSeats[loopIndex] == false) {
				firstClassSeats[loopIndex] = true;
				System.out.println("You have successfully reserved first class ticket, your seat number is " + index);
				return;
			}
			loopIndex += 1;
			index += 1;

		}

		System.out.println("sorry, first class has no more seats left\n\n");

		int seatFullIndex = SeatsFullMethod();

		if (seatFullIndex == 5) {
			System.out.println("Sorry, the seats are full, Next flight is in 3 hours");
			return;
		}

		System.out.println("Would you like to reserve seat in economy class? ");

		String changeClass = scan.nextLine();
		if (changeClass == "yes" || changeClass == "YES") {
			EconomySeatReservation();

		}
		if (changeClass == "no" || changeClass == "NO") {
			return;
		}
		return;
	}

	// This method determines if the seats are available to reserve or not.
	public int SeatsFullMethod() {

		int seatFullIndex = 0;
		while (seatFullIndex < 5) {

			if (firstClassSeats[seatFullIndex] == true && economySeats[seatFullIndex] == true) {
				seatFullIndex += 1;

			} else {
				return (seatFullIndex);

			}
		}

		return (seatFullIndex);

	}

}
