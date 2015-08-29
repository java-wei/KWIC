import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class controller {
	public static void main(String[] args) {
		List<String> result = new ArrayList<String>();
		System.out.println("Please indicate your pattern choice: ");
		System.out.println("1: Pipe and Filter \t2: Implicit Invocation");
		Scanner reader = new Scanner(System.in);
		int choice = reader.nextInt();
		if(choice == 1)
			result = runPattern1();
		else 
			result = runPattern2();
		System.out.print("test");
	}

	private static List<String> runPattern1() {
		// TODO Auto-generated method stub
		return null;
	}
	private static List<String> runPattern2() {
		// TODO Auto-generated method stub
		return null;
	}



}
