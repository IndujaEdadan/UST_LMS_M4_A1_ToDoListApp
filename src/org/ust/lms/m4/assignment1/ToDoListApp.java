package org.ust.lms.m4.assignment1;

import java.util.Scanner;

/*Create a Java class to represent a task (description, due date).
Use arrays to store tasks.
Implement operations like adding, removing, and displaying tasks
*/
public class ToDoListApp {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int choice;
			do {
				System.out.println("Enter the choice :");
				System.out.println("1. Add Tasks \n  2.Remove Tasks \n  3.Display Tasks \n 4.Exit");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					addTask();
					break;
				case 2:
					removeTask();
					break;
				case 3:
					displayTask();
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid Choice !!");

				}

			} while (choice != 4);

			scanner.close();

		}

	}

	private static void displayTask() {

	}

	private static void removeTask() {

	}

	private static void addTask() {

	}

}
