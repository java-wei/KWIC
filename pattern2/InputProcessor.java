package pattern2;

import java.awt.Desktop;
import java.io.File;

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
		
		if(commandType.equalsIgnoreCase("AT")) {	// Add title command
			titles.insert(commandString);
		} else if(commandType.equalsIgnoreCase("AI")) {	// Add ignored words command
			titles.addWordsToIgnore(commandString);
		} else if(commandType.equalsIgnoreCase("CT")) {	// Clear title command
			titles.clearTitles();
		} else if(commandType.equalsIgnoreCase("CI")) {	// Clear ignored keyword command
			titles.clearIgnoredWords();
		} else if(commandType.equalsIgnoreCase("help")) {
			openHelpFile();
		} else if(commandType.equalsIgnoreCase("exit")) {	// Exit command
			System.out.println("See you again. Have a nice day!");
			System.exit(0);
		} else {	// Invalid command
			System.out.println("Invalid command pattern!\n");
		}
	}
	
	private void openHelpFile() {
		File file = new File("README.txt");
		try {
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				String cmd = "rundll32 url.dll,FileProtocolHandler " + file.getCanonicalPath();
				Runtime.getRuntime().exec(cmd);
			} else {
				Desktop.getDesktop().edit(file);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
