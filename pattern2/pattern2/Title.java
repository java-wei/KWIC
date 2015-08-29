package pattern2;

import java.util.ArrayList;

/**
 * @author Charles Cheng
 *
 */

public class Title {
	
	private ArrayList<String> titles;
	private CircularShifter shifter;
	
	public Title() {
		titles = new ArrayList<String>();
		shifter = new CircularShifter(this);
	}

	public void addWordsToIgnore(String wordsToIgnore) {
		shifter.addWordsToIgnore(wordsToIgnore);
	}
	
	public void insert(String command) {
		String[] arr = command.split(",");
		int start = titles.size();
		int length = arr.length;
		for (int i=0; i<length; i++) {
			titles.add(arr[i].trim());
		}
		shifter.circularShift(start, start + length);
	}

	
	public String getTitle(int index) {
		return titles.get(index);
	}

	public void clearTitles() {
		titles.clear();
		shifter.clearLines();
	}
	
	public void clearIgnoredWords() {
		shifter.clearIgnoredWords();
	}
}
