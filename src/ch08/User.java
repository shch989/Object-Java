package ch08;

public class User {
	
	public int height; 
	public int weight; 
	public String name;
	public int age; 
	
	public User(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showUser() {
		System.out.println("Ű�� " + height + "�̰� �����԰� " + weight 
				+ "ų���� ������ �ֽ��ϴ�. �̸��� " + name + " �̰� ���̴� " + age + "���Դϴ�.");
	}
}
