package ch15;

public class Text {
	
	String textName;
	int money;
	
	public Text(String textName) {
		this.textName = textName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showinfo() {
		System.out.println(textName + "�ý� ������ " + money + "�� �Դϴ�.");
	}
}
