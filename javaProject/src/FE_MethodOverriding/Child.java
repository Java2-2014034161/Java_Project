package FE_MethodOverriding;

public class Child extends Parent{
	
	//메소드 옵라이드
	public void print(){
		super.print();	//부모 클래스의 메소드 호출
		System.out.println("자식 클래스의 print() 메소드");
	}
			

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.print();
	}

}
