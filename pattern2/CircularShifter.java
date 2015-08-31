package pattern2;

import java.util.ArrayList;

/**
 * @author Charles Cheng
 *
 */

public class CircularShifter {

	private Title titles;
	
	public CircularShifter(Title object) {
		titles = object;
	}

	public void addWordsToIgnore(String s) {
		String[] arr = s.split(",");
		int length = arr.length;
		for (int i=0; i<length; i++) {
			Lines.addWordsToIgnore(arr[i].trim().toLowerCase());
		}
	}
	
	public void circularShift(int start, int end) {
		
		ArrayList<String> shiftedLines = new ArrayList<String>();
		
		for (int k = start; k < end; k++) {
			String title = titles.getTitle(k);
			String[] arr = capitalizeFirstCharacter(title.split(" "));
			int length = arr.length;
	
			for(int i=0; i<length; i++) {
				String shiftedLine = "";
				for(int j=0; j<length; j++) {
					int index = (i+j)%length;
					shiftedLine += arr[index] + " ";
				}
					
				shiftedLines.add(shiftedLine);
	
			}
		}
		
		Lines.insert(shiftedLines);
		Alphabetizer.sort();
	}	

	// Capitalize first character of the keyword that is not an ignored word
	private String[] capitalizeFirstCharacter(String[] arr) {
		for (int i=0; i<arr.length; i++) {
			String word = arr[i].replaceAll("\\s", "");
			if(!word.equals("") && !word.equals(" ")) {
				String firstCharacter = word.substring(0,1);
				arr[i] = firstCharacter.toUpperCase() + word.substring(1);
			}
		}
		return arr;	
	}

	public void clearIgnoredWords() {
		Lines.clearIgnoredWords();
	}

	public void clearLines() {
		Lines.clearLines();
	}
	
}
