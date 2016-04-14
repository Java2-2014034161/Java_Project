package sample0414;

public class Car {
	
	private int man;
	private int tire;
	private String color;
	
	
	
	public void setMan(int man){
		this.man = man;
		System.out.println(man);
	}
	public void all_setting(int tire, String color){
		this.tire = tire;
		this.color = color;
	}
	public int getMan(){
		//System.out.println(man);
		return man;
	}
	
	void pr(){
		System.out.println("man : " + man + " tire : " + tire + " color : " + color);
	}

	public Car() {man = 4; tire = 3; color ="red";}
	
	public Car(int man, int tire, String color){
		this.man = man; this.tire = tire; this.color = color;
	}
	
}
