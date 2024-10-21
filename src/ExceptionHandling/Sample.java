package ExceptionHandling;

public class Sample {
	public static void main(String args[]) {
		try {
		int data =100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("print the value");
	}

}
