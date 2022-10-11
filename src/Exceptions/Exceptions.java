package Exceptions;
public class Exceptions {
	public static void main(String[] args) {
		int a=100;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException d) {
			//System.out.println(d);
			System.out.println("Number is Zero");
		}
		
	}

}
