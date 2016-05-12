package sample0512;

public class Lion extends Animal{
	private int legs;
	


	public Lion() {
		super(100, "king");	//super 안써도 돌아감. 근데 왜 썼을까?? 
		//()인자가 아무것도 없는거 돌리겠다...
		//부모생성자 super로 통일한거. super 쓰면 부모생성자 호출
		this.legs = 4;
	}
	void roar() {System.out.println("roar()가 호출되었음");}
	void infor() {System.out.println("weight" + " ");}
}
