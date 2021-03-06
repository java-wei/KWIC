package pattern1;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InputProcessor {
	CircularShift cs = new CircularShift();
	//not for ui call. For controller call
	public void takeInput(Data data) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String parser;
		List<String> inputList = new LinkedList<String>();
		if(s.indexOf(" ")>=1){
			parser = s.substring(0, s.indexOf(" "));
			inputList= new LinkedList<String>(Arrays.asList(s.trim().substring(s.indexOf(" ")).split(",")));
		}
		else 
			parser = s.trim();
		
		
		
		//add titles
		if(parser.equalsIgnoreCase("AT")){
			data.titles.addAll(inputList);//to-do: check repeat titles and words to ignore
		}
		//add words to ignore
		else if(parser.equalsIgnoreCase("AI")){
			List<String> wordList = new LinkedList<String>(Arrays.asList(s.substring(1).replaceAll("^[,\\s]+", "").split("[,\\s]+")));
			data.wordsToIgnore.addAll(wordList);
		}
		//clear everything in data
		else if(parser.equalsIgnoreCase("CT")){
			data.titles.clear();
		} 
		else if(parser.equalsIgnoreCase("CI")){
			data.wordsToIgnore.clear();
		}
		else if(parser.equalsIgnoreCase("Exit")){
			System.out.println("See you again. Have a nice day!");
			System.exit(0);
		}
		else if(parser.equalsIgnoreCase("help")) {
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
		else{
			System.out.println("Wrong Command!!");
		}
		
	}
	
	//Called by UIController process
	public void processCommand(Data data,String s) throws Exception {
		String parser;
		List<String> inputList = new LinkedList<String>();
		if(s.indexOf(" ")>=1){
			parser = s.substring(0, s.indexOf(" "));
			inputList= new LinkedList<String>(Arrays.asList(s.trim().substring(s.indexOf(" ")).split(",")));
		}
		else 
			parser = s.trim();
		
		
		
		//add titles
		if(parser.equalsIgnoreCase("AT")){
			data.titles.addAll(inputList);//to-do: check repeat titles and words to ignore
		}
		//add words to ignore
		else if(parser.equalsIgnoreCase("AI")){
			List<String> wordList = new LinkedList<String>(Arrays.asList(s.substring(1).replaceAll("^[,\\s]+", "").split("[,\\s]+")));
			data.wordsToIgnore.addAll(wordList);
		}
		//clear everything in data
		else if(parser.equalsIgnoreCase("CT")){
			data.titles.clear();
		} 
		else if(parser.equalsIgnoreCase("CI")){
			data.wordsToIgnore.clear();
		}
		else if(parser.equalsIgnoreCase("Exit")){
			System.out.println("See you again. Have a nice day!");
			System.exit(0);
		}
		else if(parser.equalsIgnoreCase("help")) {
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
		else{
			System.out.println("Wrong Command!!");
		}
		
	}

	

}
