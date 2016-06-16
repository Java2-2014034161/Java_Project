package sample0526;

//추상메소드를 가지는 인터페이스와 이 인터페이스를 구현하는 클래스 작성
public interface OperateCar {

	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}
