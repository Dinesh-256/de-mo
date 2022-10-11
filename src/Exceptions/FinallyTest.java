package Exceptions;

public class FinallyTest {
	public static void main(String[] args) {
		try {
		int a=2/0;
		System.out.println(a);
		
	}
	    catch(ArithmeticException d) {
		System.out.println("Number zero");
		}	
		catch(NullPointerException d) {
		System.out.println("Null error");	
		}
		finally {
			System.out.println("final ");
		}
	}

}
