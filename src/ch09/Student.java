package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea = new Subject();;
	Subject math = new Subject();
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
//		korea = new Subject();
//		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}
}
