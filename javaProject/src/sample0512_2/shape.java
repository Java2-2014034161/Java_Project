package sample0512_2;

abstract public class shape {

	protected int x, y;	//protected�� �ϸ� circle���� x, y ��밡��
	
	public shape() {x = 0; y = 0;} //������ �����ε��� ���� �ƹ��͵� ���� ������ �ϳ� �־��ִ°� ����
	
	public shape(int _x, int  _y){
		x = _x; this.y = _y;
	}
	//shape �� ���ٰ� ���� But �������� �����ϰ�
	abstract public void move(int _x, int _y);   //{this.x += _x; y +=_y;}
	//abstract public void infor();
	//�����Ű�� ���� �������� move �� (�߻�Ŭ������ ����� ����)
}
