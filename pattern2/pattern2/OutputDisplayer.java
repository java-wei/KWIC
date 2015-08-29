package pattern2;

import java.util.ArrayList;

/**
 * @author Charles
 *
 */

public class OutputDisplayer {

	public void display() {
		if(Lines.getIgnoredWordsSize() == 0) {
			printLinesWithoutIgnoredWords();
		} else {
			printLinesWithIgnoredWords();
		}
	}

	public void printLinesWithoutIgnoredWords() {
		int size = Lines.getSize();
		int numOfResult = 0;
		System.out.println("List of words to ignore is empty!\n");
		System.out.println("=========================================");
		
		for(int i=0; i<size; i++) {
			System.out.println(Lines.getLine(i));
			numOfResult++;
		}
		System.out.println("=========================================");
		System.out.println("\nNumber of lines is " + numOfResult + "!\n");
	}
	
	public void printLinesWithIgnoredWords() {
		int size = Lines.getSize();
		int numOfResult = 0;
		System.out.println("List of words to ignore is " + Lines.getIgnoredWordsString() + ".\n");
		System.out.println("=========================================");
		
		ArrayList<String> ignoredWordList = Lines.getIgnoredWordsList();
		String line, firstWord;
		
		for(int i=0; i<size; i++) {
			line = Lines.getLine(i);
			firstWord = line.substring(0, line.indexOf(' ')).toLowerCase();
			if(!ignoredWordList.contains(firstWord)) {
				System.out.println(Lines.getLine(i));
				numOfResult++;
			}
		}
		
		System.out.println("=========================================");
		System.out.println("\nNumber of lines is " + numOfResult + "!\n");
	}
	
}
