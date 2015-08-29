import java.util.InputMismatchException;
import java.util.Scanner;

import pattern1.P1controller;
import pattern2.Controller;


public class controller {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		P1controller p1 = new P1controller();
		
		System.out.println("Please indicate your pattern choice: ");
		System.out.println("1: Pipe and Filter \t2: Implicit Invocation");
		
		int choice = 0;
		try {
			choice = reader.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please only enter digit 1 or 2!");
		}
		//allow users to switch pattern by typing 1 or 2
		if(choice == 1) {
			p1.runPattern1();
		} else {
			Controller.run();
		}
	}


}
