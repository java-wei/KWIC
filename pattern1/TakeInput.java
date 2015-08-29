package pattern1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TakeInput {
	CircularShift cs = new CircularShift();
	public void takeInput(Data data) throws IOException {
		System.out.println("add title format: T, title1, title2,... ");
		System.out.println("add words to ignore format: I, word1, word2,...");
		System.out.println("exit format: E");
		System.out.println("clear memory: C");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<String> inputList = (ArrayList<String>) Arrays.asList(s.split(","));
		
		String parser = inputList.remove(0);
		if(inputList.get(0).equals("T")){
			data.titles.addAll(inputList);//to-do: check repeat titles and words to ignore
		}
		else if(inputList.get(0).equals("W")){
			data.wordsToIgnore.addAll(inputList);
		}
		else if(inputList.get(0).equals("C")){
			data = new Data();
		}
			
		else if(inputList.get(0).equals("E"))
			System.exit(0);
			
		
	}

	

}
