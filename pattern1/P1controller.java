package pattern1;

public class P1controller {
	
		InputProcessor ti = new InputProcessor();
		Data data = new Data();
		Alphabetizer al = new Alphabetizer();
		CircularShift cs = new CircularShift();
	
	//Called by UIController return String
	public String runUIController(String s) throws Exception {
		
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
