package sample0512;

public class Lion extends Animal{
	private int legs;
	


	public Lion() {
		super(100, "king");	//super �Ƚᵵ ���ư�. �ٵ� �� ������?? 
		//()���ڰ� �ƹ��͵� ���°� �����ڴ�...
		//�θ������ super�� �����Ѱ�. super ���� �θ������ ȣ��
		this.legs = 4;
	}
	void roar() {System.out.println("roar()�� ȣ��Ǿ���");}
	void infor() {System.out.println("weight" + " ");}
}
