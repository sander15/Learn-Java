package learningjava;

public class saludar {

	public static void main(String[] args) {
		
		//while
		int n = 10;
		while (n < 20) {
			System.out.println("Hi");
			n++;
		}
		
		System.out.println("we already left the while loop");
		
		//if-else
		System.out.println("this is the if statement in action");
		
		if(n < 20) {
			System.out.println("Hello! I am n and I am less than 20");
		}else {
			System.out.println("Hello! I'm n and I'm bigger than 20");
		}
		
		//string
	     char[] helloArray = {'h', 'a', 'm', 'b', 'u', 'r', 'g', 'e', 'r'};
	     String helloString = new String(helloArray);  
	     System.out.println( helloString );
	}
}