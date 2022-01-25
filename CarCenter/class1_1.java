package CarCenter;

public class class1_1 {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		car1.setModel("케이세븐");
		car1.setPrice("사천만원");
		car1.showCarInfo();
		System.out.println();
		
		Car1 car2 = new Car1("기아", "블랙", "K7", "4천만원");
		car2.print();
		car2.setModel("쏘렌토");
	}
}
