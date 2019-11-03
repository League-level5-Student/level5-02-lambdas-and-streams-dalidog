
package _01_Lambda_Methods;

import org.hamcrest.core.SubstringMatcher;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i <10; i++) {
				System.out.println(s);
			}
		}, "hello");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String x = "";
			for (int j = s.length()-1; j > -1; j--) {
				x= x+s.charAt(j);
			}
			System.out.println(x);
		}, "hello");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String x = "";
			for (int j = 0; j < s.length(); j++) {
				if(j%2==0) {
					x= x+Character.toUpperCase(s.charAt(j));
				}
				else {
					x= x+s.charAt(j);
				}
				
			}
			System.out.println(x);
		}, "hello");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String x = "";
			for (int i = 0; i < s.length(); i++) {
				x=x+s.charAt(i)+".";
		}
			System.out.println(x);
		}, "hello");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String x = "";
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o' && s.charAt(i)!='u') {
					x=x+s.charAt(i);
				}
		}
			System.out.println(x);
		}, "hello");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
