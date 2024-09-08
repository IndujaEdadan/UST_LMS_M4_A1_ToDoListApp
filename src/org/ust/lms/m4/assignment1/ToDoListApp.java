package org.ust.lms.m4.assignment1;

import java.time.LocalDate;
import java.util.Scanner;

/*Create a Java class to represent a task (description, due date).
Use arrays to store tasks.
Implement operations like adding, removing, and displaying tasks
*/
public class ToDoListApp {
	private static final int MAX_SIZE = 10;
	private static Task[] tasks = new Task[MAX_SIZE];
	private static int taskCount = 0;

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int choice;
			do {
				System.out.println("Enter the choice :");
				System.out.println("1. Add Tasks \n  2.Remove Tasks \n  3.Display Tasks \n 4.Exit");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					addTask(scanner);
					break;
				case 2:
					removeTask(scanner);
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

	private static void removeTask(Scanner scanner) {

	}

	private static void addTask(Scanner scanner) {

		if (taskCount >= MAX_SIZE) {
			System.out.println("Task list is full. Cannot add more tasks.");
			return;
		}
		System.out.println("Enter task description");
		String description = scanner.next();

		System.out.println("Enter due date");
		LocalDate dueDate = LocalDate.parse(scanner.next());

		tasks[taskCount] = new Task(description, dueDate);
		taskCount++;
		System.out.println("Task Added !!");

	}

}
