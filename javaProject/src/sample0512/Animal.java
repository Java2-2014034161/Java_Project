package sample0512;

public class Animal {
	private double weight;
	private String picture;
	
	public Animal() {weight = 99; picture = "Animal";
	System.out.println("Animal Cont");}
	
	
	public Animal(double weight, String picture) {
	//������ 2��. �ڵ�ȣ���� ���ڰ� �ƹ��͵� ���°� ȣ����.
		this.weight = weight;	
		this.picture = picture;
		System.out.println("Animal Cont2");
	}


	void eat() { System.out.println("eat()�� ȣ��Ǿ���");}
	void sleep() {System.out.println("sleep()�� ȣ��Ǿ���");}
	

	//����� ���� �θ�Ŭ������
	//lion�� �ٲٰ� ���� �� �θ�Ŭ������ Animal���� �ٲٴ� �� �� ����
	//lion���� �ٲٸ� eagle���� �� ����� �ϴ� ������
}
