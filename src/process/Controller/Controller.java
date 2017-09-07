package process.Controller;

import java.util.Scanner;

public class Controller {
	public void start() {
		String x = "Hello, I have made this project.";
		System.out.println(x);
		
		testScanner();
	}
	
	private void testScanner() {
		String x = "What is your favorite color?";
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println(x);
		String answer = firstScanner.next();
		System.out.println("Oh cool, I like " + answer);
		firstScanner.close();
	}
}
