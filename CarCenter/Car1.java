package CarCenter;

import class1227.Car;

public class Car1 {
	public static final String DARIJUM = "���뱸 ������";
	private String company;
	private String color;
	private String model;
	private String price;
	
	//�⺻ ������
//	public Car1() {
//		super();
//	}
	
	public Car1() {
		company = "���"; 
		color = "��";
		price = "4õ����";
		model = "K7";
	}
	
	public Car1(String company, String color, String model, String price) {
		this.company = company;
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	public void print() {
		System.out.println("������ : " + company);
		System.out.println("������ : " + model);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("�븮���� : " + Car1.DARIJUM);
	}
	
	public void showCarInfo() {
		String info = "�븮�� : " + Car1.DARIJUM.toString() + "\n";
		info += "������ : " + company.toString() + "\n";
		info += "�� : " + model.toString() + "\n";
		info += "���� : " + color.toString() + "\n";
		info += "���� : " + price.toString() + "\n";
		System.out.println(info);
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public String getPrice() {
		return price;
	}
	
}
