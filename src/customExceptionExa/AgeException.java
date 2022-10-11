package customExceptionExa;

public class AgeException {
	public static void main(String[] args) {
		
		try {
		TestCustomException1.validate(17);
		}
		catch(InvalidAgeException ex) {
			System.out.println("Caught the exception");  
		    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
			
		}
		 System.out.println("rest of the code...");    
		
	}

}
