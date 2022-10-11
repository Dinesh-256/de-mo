package Exceptions;

public class MultipleException {
	public static void main(String[] args) {
		try {
			int[] a=new int[1];
			int c=a[0]=100/0;
			System.out.println(c);
			
		}
		catch(ArithmeticException d) {
			System.out.println("Number is Zero");
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("Array index of bound");
		}
		
	}

}
