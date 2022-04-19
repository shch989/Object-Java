package ch08;

public class OrderTest {

	public static void main(String[] args) {
		// 과제 2
		Order orderKim = new Order("202011020003", "010-2345-0001", "서울시 강남구 역삼동 111 - 333", 20201102, 130258, 35000, "0003");
		
		orderKim.showOrder();
	}

}
