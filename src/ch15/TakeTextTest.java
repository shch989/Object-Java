package ch15;

public class TakeTextTest {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		
		Text text1 = new Text("잘 간다 운수택시");
		studentE.text(text1);
		
		studentE.showInfo();
		text1.showinfo();
		
	}

}
