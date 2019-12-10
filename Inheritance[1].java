package basics;

abstract class Person {
	
	private int age;
	
	Person(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: age - " + age;
	}
	
	public abstract String getQualifications();
	
	protected final int getNumberOfEyes() {
		return 2;
	}
	
}

final class Student extends Person {

	Student(int age) {
		super(age);
	}

	@Override
	public String getQualifications() {
		return "Student";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Qualification - Student";
	}
	
}

/*
 * class Abc extends Student {
 * 
 * }
 */

public class Inheritance {
	
	public static void main(String[] args) {
		Person s = new Student(7);
		System.out.println(s.getNumberOfEyes());
		if (s instanceof Student) {
			System.out.println("I am a Student");
		} else if (s instanceof Person) {
			System.out.println("I am a Person");
		}
	}
	
}
