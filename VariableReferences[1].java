package basics;

class Employee {
	
	private int age;
	
	Employee(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee: age - " + age;
	}
	
}

public class VariableReferences {

	public static void main(String[] args) {
		final Employee s = new Employee(7);
		System.out.println(s);
	}

}
