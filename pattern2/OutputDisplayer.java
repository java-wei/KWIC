package pattern2;

import java.util.ArrayList;

/**
 * @author Charles
 *
 */

public class OutputDisplayer {

	
	public String getOutput() {
		if(Lines.getIgnoredWordsSize() == 0) {
			return getOutputWithoutIgnoredWords();
		} else {
			return getOutputWithIgnoredWords();
		}
	}

	public String getOutputWithoutIgnoredWords() {
		int size = Lines.getSize();
		String result = "";
		for(int i=0; i<size; i++) {
			result += Lines.getLine(i) + "\n";
		}
		
		return result;
	}
	
	public String getOutputWithIgnoredWords() {
		int size = Lines.getSize();
		String result = "";
		ArrayList<String> ignoredWordList = Lines.getIgnoredWordsList();
		String line, firstWord;
		
		for(int i=0; i<size; i++) {
			line = Lines.getLine(i);
			firstWord = line.substring(0, line.indexOf(' ')).toLowerCase();
			if(!ignoredWordList.contains(firstWord)) {
				result += Lines.getLine(i) + "\n";
			}
		}
		
		return result;
	}
	
}
