package pattern1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class P1controller {
	
	public void runPattern1() throws IOException{
		TakeInput ti = new TakeInput();
		Data data = new Data();
		Alphabetizer al = new Alphabetizer();
		CircularShift cs = new CircularShift();
		ArrayList<String> result = new ArrayList<String>(); 
		//make it to be recursive call
		//while(true){
			ti.takeInput(data);
			cs.circularShift(data);
			al.alphabetize(data);
			data.display();
		//}
	}
	
	public void display(Data data){
		//to do
	}
}
