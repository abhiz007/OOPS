package ExceptionHandling;

public class TestThrow {

	// function to check wheter a person is eligible to vote or not
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
			
		}
		else {
			System.out.println("Person is eligible to vote");
		}
	}
}
