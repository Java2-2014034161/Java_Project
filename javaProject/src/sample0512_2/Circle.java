package sample0512_2;

public class Circle extends shape {
	
	private int r;
	
	public Circle() { r = 3;}	// r�ʱ�ȭ
	
	public void move(int _x, int _y){
		x = _x+r; y = _y+r;
	}
	
	public void info() {System.out.println("C x : " + x + " y :" + y);}
	//info�Լ� : ����ϴ� ���
	
	//public void iii(){System.out.println(r);}

}
