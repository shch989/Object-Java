package ch15;

public class TakeTextTest {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		
		Text text1 = new Text("�� ���� ����ý�");
		studentE.text(text1);
		
		studentE.showInfo();
		text1.showinfo();
		
	}

}
