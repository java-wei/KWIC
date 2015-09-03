package pattern2;


/**
 * @author Charles Cheng
 *
 */

public class Controller {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static String run(String command) {
		InputProcessor processor = new InputProcessor();
		OutputDisplayer displayer = new OutputDisplayer();

		processor.processInput(command);
		return displayer.getOutput();
	}

}
