package class1227;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���α׷��� -> ��ü���� ���α׷���
		// ���� �Ǹ� ���α׷�
		Car car = new Car(); // ���� Ŭ���� ��ü ����
		Car.darijum = "���뱸 ������";
		car.setModel("�ҳ�Ÿ");
		car.setCompany("����");
		car.setColor("���");
		car.setPrice("3000����");
		System.out.println("��: " + car.getMode());
		System.out.println("����: " + car.getPrice());
		
		new Car();
		new Car("�Ｚ", "�Ķ�", "3000����", "SM5");
		Car car2 = new Car();
		Car car3 = new Car();
		car3.setModel("�׷���");
		car3.setCompany("����");
		car3.setColor("����");
		car3.setPrice("4000����");
		System.out.println("��: " + car3.getMode());
		System.out.println("����: " + car3.getPrice());
	}

}
