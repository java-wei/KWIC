import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pattern1.P1controller;


public class controller {
	
	public static void main(String[] args) throws Exception {
		P1controller p1 = new P1controller();
		
		List<String> result = new ArrayList<String>();
		System.out.println("Please indicate your pattern choice: ");
		System.out.println("1: Pipe and Filter \t2: Implicit Invocation");
		Scanner reader = new Scanner(System.in);
		int choice = reader.nextInt();
		
		//allow users to switch pattern by typing 1 or 2
		if(choice == 1)
			p1.runPattern1();
		//else 
		//	result = runPattern2();
		for(int i = 0; i < result.size(); i++)
			System.out.print(result.get(i));
	}


}
