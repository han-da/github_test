package class1227;

public class Car {
	// �߻�ȭ - Ư¡�� ������ ����ȭ
	// ĸ��ȭ - ���� ��ȣ
	// �Ӽ�(����)
	// public, private, protected, default
	public static String darijum;	// �븮���� (Ŭ���� ����)
	private String company;	// ������
	private String color;	// ����
	private String price;	// ����
	private String model;	// ���� ��
	
	// �⺻������
	public Car() {
		company = "���";
		color = "����";
		price = "3000����";
		model = "K5";
	}
	
	// �޽�� �����ε�(�ߺ�����)
	public Car(String company, String color, String price, String model) {
		this.company = company;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	public Car(String color, String price, String model) {
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	
	
	// setter
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setColor(String co) {
		color = co;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getMode() {
		return model;
	}
	
	public String getPrice() {
		return price;
	}
}
