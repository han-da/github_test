package class1227;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구조적 프로그래밍 -> 객체지향 프로그래밍
		// 차량 판매 프로그램
		Car car = new Car(); // 차량 클래스 객체 생성
		Car.darijum = "동대구 영업점";
		car.setModel("소나타");
		car.setCompany("현대");
		car.setColor("흰색");
		car.setPrice("3000만원");
		System.out.println("모델: " + car.getMode());
		System.out.println("가격: " + car.getPrice());
		
		new Car();
		new Car("삼성", "파랑", "3000만원", "SM5");
		Car car2 = new Car();
		Car car3 = new Car();
		car3.setModel("그랜저");
		car3.setCompany("현대");
		car3.setColor("검정");
		car3.setPrice("4000만원");
		System.out.println("모델: " + car3.getMode());
		System.out.println("가격: " + car3.getPrice());
	}

}
