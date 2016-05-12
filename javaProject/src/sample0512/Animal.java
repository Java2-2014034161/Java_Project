package sample0512;

public class Animal {
	private double weight;
	private String picture;
	
	public Animal() {weight = 99; picture = "Animal";
	System.out.println("Animal Cont");}
	
	
	public Animal(double weight, String picture) {
	//생성자 2개. 자동호출은 인자가 아무것도 없는거 호출함.
		this.weight = weight;	
		this.picture = picture;
		System.out.println("Animal Cont2");
	}


	void eat() { System.out.println("eat()가 호출되었음");}
	void sleep() {System.out.println("sleep()가 호출되었음");}
	

	//공통된 것은 부모클래스에
	//lion값 바꾸고 싶을 때 부모클래스인 Animal에서 바꾸는 게 더 좋음
	//lion에서 바꾸면 eagle에서 또 써줘야 하는 불편함
}
