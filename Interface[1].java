package basics;

interface Animal {
	
	public static final String TYPE = "Animal";
	
	public abstract String getCall();
}

interface LandAnimal extends Animal {
	
	public static final String TYPE = "Land Animal";
	
	public abstract int getNumberOfLegs();
}

class Dog implements Animal {

	@Override
	public String getCall() {
		return "Bark";
	}
	
}

class Cat implements Animal {

	@Override
	public String getCall() {
		return "Meow";
	}
	
}

class Lion implements LandAnimal {

	@Override
	public int getNumberOfLegs() {
		return 4;
	}

	@Override
	public String getCall() {
		return "Roar";
	}
	
}

public class Interface {
	
	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a.getCall());
		
		LandAnimal l = new Lion();
		System.out.println(l.getNumberOfLegs());
		
	}
	
}
