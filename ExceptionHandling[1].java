package basics;

public class ExceptionHandling {

	public static void main(String[] args) {
		int numerator = 1;
		int denominator = 0;
		
		try {
			System.out.println(intDivision(numerator,  denominator));
		} catch(NullPointerException ne) {
			System.out.println("Deno cannot be zero");
		} finally {
			System.out.println("Program ended");
		}
	}
	
	static int intDivision(int num, int deno) throws NullPointerException {
		if (deno == 0) {
			throw new NullPointerException();
		}
		return num/deno;
	}
	
}
