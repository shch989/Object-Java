package ch08;

public class Order {
	
	public String orderNumber;
	public String orderPhone;
	public String orderAdress;
	public int date;
	public int time;
	public int price;
	public String menuNumber;
	
	public Order(String orderNumber, String orderPhone, String orderAdress, int date, int time, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhone = orderPhone;
		this.orderAdress = orderAdress;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrder() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + orderPhone);
		System.out.println("�ֹ� �� �ּ� : " + orderAdress);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� �ð� : " + time);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
}
