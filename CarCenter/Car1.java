package CarCenter;

import class1227.Car;

public class Car1 {
	public static final String DARIJUM = "동대구 영업소";
	private String company;
	private String color;
	private String model;
	private String price;
	
	//기본 생성자
//	public Car1() {
//		super();
//	}
	
	public Car1() {
		company = "기아"; 
		color = "블랙";
		price = "4천만원";
		model = "K7";
	}
	
	public Car1(String company, String color, String model, String price) {
		this.company = company;
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	public void print() {
		System.out.println("제조사 : " + company);
		System.out.println("차량명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("대리점명 : " + Car1.DARIJUM);
	}
	
	public void showCarInfo() {
		String info = "대리점 : " + Car1.DARIJUM.toString() + "\n";
		info += "제조사 : " + company.toString() + "\n";
		info += "모델 : " + model.toString() + "\n";
		info += "색상 : " + color.toString() + "\n";
		info += "가격 : " + price.toString() + "\n";
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
