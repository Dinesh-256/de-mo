public class TestThrow {  
    //defining a method  
	int num1;
	int num2;
    public  void checkNum(int num1,int num2) {  
        if (num1 < 1 || num2<1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of "  + (num1*num2));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
            TestThrow obj = new TestThrow();  
            obj.checkNum(3,2);  
            System.out.println("Rest of the code..");  
    }  
}  