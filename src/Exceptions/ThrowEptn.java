package Exceptions;

public class ThrowEptn {
	public void age(int age) {
		try {
		if(age<18) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Person is Vote Eligible");
		}
		}
		catch(ArithmeticException e) {
			System.out.println("Person Not Eligible for Vote");
		}
	}

}
