package pattern1;

import java.io.IOException;
import java.util.ArrayList;

public class P1controller {
	
		InputProcessor ti = new InputProcessor();
		Data data = new Data();
		Alphabetizer al = new Alphabetizer();
		CircularShift cs = new CircularShift();
	
	public void runPattern1() throws Exception {
		
		String result;
		//make it to be recursive call
		while(true){
			result = "";
			ti.takeInput(data);;
			cs.circularShift(data);
			al.alphabetize(data);
			/*for(int  i = 0; i< data.result.size();i++)
				result+=data.result.get(i)+"\n";
			return result;*/
			data.display();
		}
	}
	public String run(String s) throws Exception {
		
		String result;
		//make it to be recursive call
		while(true){
			result = "";
			ti.processCommand(data, s);
			cs.circularShift(data);
			al.alphabetize(data);
			for(int  i = 0; i< data.result.size();i++)
				result+=data.result.get(i)+"\n";
			return result;
		}
	}
}
