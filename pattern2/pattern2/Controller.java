package pattern2;

import java.util.Scanner;

/**
 * @author Charles Cheng
 *
 */

public class Controller {

	/**
	 * @param args
	 */
	public static void run() {
		InputProcessor processor = new InputProcessor();
		OutputDisplayer displayer = new OutputDisplayer();

		Scanner sc = new Scanner(System.in);
		String command;
		System.out.println("Please enter the command: ");
		while(sc.hasNext()) {
			command = sc.nextLine();
			processor.processInput(command);
			displayer.display();
		}
		sc.close();
	}

}
