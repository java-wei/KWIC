package pattern1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TakeInput {
	CircularShift cs = new CircularShift();
	public void takeInput(Data data) throws IOException {
		System.out.println("add title format: T, title1, title2,... ");
		System.out.println("add words to ignore format: I, word1, word2,...");
		System.out.println("exit format: E");
		System.out.println("clear memory: C");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<String> inputList = new LinkedList<String>(Arrays.asList(s.split(",")));
		
		String parser = inputList.remove(0);
		
		//add titles
		if(parser.equals("T")){
			data.titles.addAll(inputList);//to-do: check repeat titles and words to ignore
		}
		//add words to ignore
		else if(parser.equals("I")){
			data.wordsToIgnore.addAll(inputList);
		}
		//clear everything in data
		else if(parser.equals("C")){
			data = new Data();
		}	
		else if(parser.equals("E")){
			System.exit(0);
		}
		//data.display();
	}

	

}
