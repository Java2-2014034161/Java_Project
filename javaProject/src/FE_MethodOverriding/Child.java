package FE_MethodOverriding;

public class Child extends Parent{
	
	//�޼ҵ� �ɶ��̵�
	public void print(){
		super.print();	//�θ� Ŭ������ �޼ҵ� ȣ��
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}
			

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.print();
	}

}
