package learningjava;

public class saludar {

	public static void main(String[] args) {
		
		//while
		int n = 10;
		while (n < 20) {
			System.out.println("hola");
			n++;
		}
		
		System.out.println("ya salimos del while uwu");
		
		//if-else
		System.out.println("ahora vamos con el IF");
		
		if(n < 20) {
			System.out.println("hola! soy n y soy menor que 20");
		}else {
			System.out.println("hola! soy n y soy mayor que 20");
		}
		
		//string
	     char[] uwuArray = {'h', 'e', 'l', 'l', 'o'};
	     String uwuString = new String(uwuArray);  
	     System.out.println( uwuString );
	}
}
