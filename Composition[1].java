package basics;

class Timestamp {
	private int date;
	private int month;
	private int year;
	
	public Timestamp(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
}

class Worker {
	
	private Timestamp dateOfBirth;
	
	Worker(int d, int m, int y) {
		dateOfBirth = new Timestamp(d, m, y);
	}
}

public class Composition {
//	Timestamp ts = new Timestamp(11, 11, 2011);
	Worker w = new Worker(11, 11, 2011);
}
