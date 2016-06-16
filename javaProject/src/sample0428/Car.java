package sample0428;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	
	private int id;
	private static int numbers = 0;		//������ Car ��ü�� ������ ���� ��������
	
	public Car(String m, String c, int s){
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	
	//���� �޼ҵ�
	public static int getNumberOfCars(){
		return numbers;
	}

}
