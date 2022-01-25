package class1227;

public class Car {
	// 추상화 - 특징을 빠르게 변수화
	// 캡슐화 - 정보 보호
	// 속성(변수)
	// public, private, protected, default
	public static String darijum;	// 대리점명 (클래스 변수)
	private String company;	// 제조사
	private String color;	// 색상
	private String price;	// 가격
	private String model;	// 차량 모델
	
	// 기본생성자
	public Car() {
		company = "기아";
		color = "빨강";
		price = "3000만원";
		model = "K5";
	}
	
	// 메쏘드 오버로딩(중복정의)
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
