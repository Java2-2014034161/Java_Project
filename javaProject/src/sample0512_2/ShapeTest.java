package sample0512_2;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shape s1 = new shape(); �ʿ���ٰ� �����ϰ� Rectangle�� Circle�θ� ����.
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		//s1.move(99,  99);
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1); 
		infor(c1);
		
		//Rectangle r1 = new Rectangle(); �� �ʿ� ����
		//shape r1 = new Rectangle();
		//shape c1 = Circle();
		//shape r2 = new Rectangle();
		
		//r.info(); shape�� info�� ���ư��� ������ �޼ҵ�������̵��� �ؼ� ��ü�� �´� info ���ư��� �� 
		
		
	}

	static void infor(Rectangle r) {r.info(); } 
	//�� static?? class �� ���� ���ư�.
	static void infor(Circle c) { c.info();}
	
	//static void infor(shape ro) {ro.info(); ro.iii();} ���� ���� ���� shape. r�� �� �� ����
	//�Լ� �ϳ��� ����.. 30�� ���� �ʿ� ����
	//static void inofrr(Rectangle r) {r.info();} �ڽ��� 30��.. �޼ҵ� 30��... ���ڸ� ������ ����� ��� �Լ��� �� �������� ��
	
	//������ : �θ�Ŭ������ �̿��Ͽ� �ڽ�Ŭ���� �� �� �� ����. �� �޼ҵ�������̵� �����!!
	//�� ����... Ư�� �޼ҵ忡�� ������ �����ְ� ������ �� ���� �ϰ� �ʹ�.
}
