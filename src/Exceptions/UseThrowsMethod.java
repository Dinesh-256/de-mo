package Exceptions;

public class UseThrowsMethod {
	public static void main(String[] args) {
		try {
		ThrowsMethod tm=new ThrowsMethod();
		System.out.println(tm.dividNum(100, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("\n Number is Zero");
		}
		
		
	}

}
