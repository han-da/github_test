package CarCenter;

public class class1_1 {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		car1.setModel("���̼���");
		car1.setPrice("��õ����");
		car1.showCarInfo();
		System.out.println();
		
		Car1 car2 = new Car1("���", "��", "K7", "4õ����");
		car2.print();
		car2.setModel("���");
	}
}
