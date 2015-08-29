package pattern1;

import java.util.ArrayList;

public class Data {
	ArrayList<String> titles = new ArrayList<String>();
	ArrayList<String> wordsToIgnore = new ArrayList<String>();
	public Data(){
	}
	public void display() {
		for(int i = 0; i < titles.size(); i++)
			System.out.println(titles.get(i));
		for(int i = 0; i < wordsToIgnore.size(); i++)
			System.out.print(wordsToIgnore.get(i));
	}
	
}
