package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 95);
		studentLee.setMathSubject("수학", 100);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 89);
		studentKim.setMathSubject("수학", 96);
		
		studentKim.showScore();
		studentLee.showScore();
	}

}
