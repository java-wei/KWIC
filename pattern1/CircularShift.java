package pattern1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CircularShift {


	//This is to shift the titles and Capitalize the first letter and store them in data.result as a list 
	public void circularShift(Data data) {
		// clear previous stored result
		data.result.clear();
		for(int i = 0; i <data.titles.size();i++){
			
			String tepTitle = data.titles.get(i);
			//remove the leading and ending space and split by space of the title
			List<String> wordsOfTitle = new LinkedList<String>(Arrays.asList(tepTitle.trim().split(" ")));
			int wordsOfTitleLenth = wordsOfTitle.size();
			
			
			for(int j = 0; j<wordsOfTitleLenth; j++){				
				//if this is a key word
				boolean isKeyWord = true;
				if(!data.wordsToIgnore.contains(wordsOfTitle.get(0))) {
					
					//capitalize the first letter of the word
					String s =wordsOfTitle.get(0).substring(0, 1).toUpperCase() + wordsOfTitle.get(0).substring(1);
					//add space in rest of the words of the title
					
					for(int m = 1; m<wordsOfTitleLenth;m++){
						 s += " " + wordsOfTitle.get(m);
					}
					data.result.add(s);					
				}
				wordsOfTitle.add(wordsOfTitle.remove(0));
			}
			
		}
	}

}
