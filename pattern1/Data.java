package pattern1;

import java.util.ArrayList;

public class Data {
	ArrayList<String> titles = new ArrayList<String>();
	ArrayList<String> wordsToIgnore = new ArrayList<String>();
	ArrayList<String> result = new ArrayList<String>();
	public Data(){
	}
	public void display() {
		/*for(int i = 0; i < titles.size(); i++)
			System.out.println(titles.get(i));*/
		/*for(int i = 0; i < wordsToIgnore.size(); i++)
			System.out.println(wordsToIgnore.get(i));*/
		for(int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}
