package sample0512_2;

public class Circle extends shape {
	
	private int r;
	
	public Circle() { r = 3;}	// r초기화
	
	public void move(int _x, int _y){
		x = _x+r; y = _y+r;
	}
	
	public void info() {System.out.println("C x : " + x + " y :" + y);}
	//info함수 : 출력하는 기능
	
	//public void iii(){System.out.println(r);}

}
