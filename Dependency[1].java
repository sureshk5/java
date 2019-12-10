package basics;

class Paper {
	
	void writeAnswers(String ans) {
		System.out.println(ans);
	}
}

class ExamStudent {
	
	void giveTest(Paper p) {
		p.writeAnswers("abc123");
	}
}


public class Dependency {
	public static void main(String[] args) {
		ExamStudent es = new ExamStudent();
		es.giveTest(new Paper());
	}
}
