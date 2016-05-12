package sample0512_2;

abstract public class shape {

	protected int x, y;	//protected로 하면 circle에서 x, y 사용가능
	
	public shape() {x = 0; y = 0;} //생성자 오버로딩할 때는 아무것도 없는 생성자 하나 넣어주는게 좋음
	
	public shape(int _x, int  _y){
		x = _x; this.y = _y;
	}
	//shape 안 쓴다고 가정 But 연관성은 유지하고
	abstract public void move(int _x, int _y);   //{this.x += _x; y +=_y;}
	//abstract public void infor();
	//연결시키기 위한 목적으로 move 씀 (추상클래스를 만드는 이유)
}
