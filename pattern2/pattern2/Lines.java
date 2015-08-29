package pattern2;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Charles Cheng
 *
 */
public class Lines {

	private static ArrayList<String> lines = new ArrayList<String>();
	private static ArrayList<String> wordsToIgnore = new ArrayList<String>();
	
	public Lines() {
	}

	public static void insert(ArrayList<String> shiftedLines) {
		lines.addAll(shiftedLines);
	}
	
	public static ArrayList<String> getAllLines() {
		return lines;
	}
	
	public static int getSize() {
		return lines.size();
	}
	
	public static String getLine(int index) {
		return lines.get(index);
	}

	public static void addWordsToIgnore(String word) {
		wordsToIgnore.add(word);
	}
	
	public static int getIgnoredWordsSize() {
		return wordsToIgnore.size();
	}
	
	public static String getIgnoredWordsString() {
		String result = wordsToIgnore.get(0);
		int size = getIgnoredWordsSize();
		for(int i=1; i<size; i++) {
			result += ", " + wordsToIgnore.get(i);
		}
		return result;
	}
	
	public static ArrayList<String> getIgnoredWordsList() {
		return wordsToIgnore;
	}

	public static void clearIgnoredWords() {
		wordsToIgnore.clear();
	}

	public static void clearLines() {
		lines.clear();
	}
	
}
