package pattern2;

/**
 * @author Charles Cheng
 *
 */

public class InputProcessor {
	
	Title titles;
	
	public InputProcessor() {
		titles = new Title();
	}
	
	public void processInput(String command) {
		String[] arr = command.trim().split(" ", 2);
		String commandType = arr[0];
		String commandString="";
		if(arr.length > 1) {
			commandString = arr[1].trim();
		}
		
		if(commandType.equalsIgnoreCase("AT")) {
			titles.insert(commandString);
		} else if(commandType.equalsIgnoreCase("AI")) {
			titles.addWordsToIgnore(commandString);
		} else if(commandType.equalsIgnoreCase("CT")) {
			titles.clearTitles();
		} else if(commandType.equalsIgnoreCase("CI")) {
			titles.clearIgnoredWords();
		} else if(commandType.equalsIgnoreCase("exit")) {
			System.out.println("See you again. Have a nice day!");
			System.exit(0);
		} else {
			System.out.println("Invalid command pattern!\n");
		}
	}
	
	
}
