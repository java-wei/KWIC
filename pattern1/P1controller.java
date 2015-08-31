package pattern1;

import java.io.IOException;

public class P1controller {
	
	public void runPattern1() {
		InputProcessor ti = new InputProcessor();
		Data data = new Data();
		Alphabetizer al = new Alphabetizer();
		CircularShift cs = new CircularShift();
		//make it to be recursive call
		while(true){
			try {
				ti.takeInput(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
			cs.circularShift(data);
			al.alphabetize(data);
			data.display();
		}
	}
	
}
