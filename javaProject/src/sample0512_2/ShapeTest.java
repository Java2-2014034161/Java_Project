package sample0512_2;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shape s1 = new shape(); 필요없다고 가정하고 Rectangle과 Circle로만 만듦.
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		//s1.move(99,  99);
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1); 
		infor(c1);
		
		//Rectangle r1 = new Rectangle(); 쓸 필요 없음
		//shape r1 = new Rectangle();
		//shape c1 = Circle();
		//shape r2 = new Rectangle();
		
		//r.info(); shape의 info가 돌아가야 하지만 메소드오버라이딩을 해서 객체에 맞는 info 돌아가게 됨 
		
		
	}

	static void infor(Rectangle r) {r.info(); } 
	//왜 static?? class 안 만들어도 돌아감.
	static void infor(Circle c) { c.info();}
	
	//static void infor(shape ro) {ro.info(); ro.iii();} 내가 보는 눈은 shape. r을 볼 수 없음
	//함수 하나로 끝남.. 30개 만들 필요 없음
	//static void inofrr(Rectangle r) {r.info();} 자식이 30개.. 메소드 30개... 인자를 구분할 방법이 없어서 함수를 다 만들어줘야 함
	
	//다형성 : 부모클래스를 이용하여 자식클래스 다 볼 수 있음. 단 메소드오버라이딩 써야함!!
	//왜 쓰냐... 특정 메소드에서 뭔가를 던져주고 싶은데 다 보게 하고 싶다.
}
