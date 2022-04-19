package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
	
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "부산 수영구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 56789;
		studentKim.studentName = "Kim";
		studentKim.address = "부산 동래구";
		
		studentKim.showStudentInfo();
	}

}
