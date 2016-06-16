package sample0428;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	
	private int id;
	private static int numbers = 0;		//생성된 Car 객체의 개수를 위한 정적변수
	
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	
	//정적 메소드
	public static int getNumberOfCars(){
		return numbers;
	}

}
