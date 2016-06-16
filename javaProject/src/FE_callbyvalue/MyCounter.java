package FE_callbyvalue;

public class MyCounter {
//메소드로 객체전달하기
	int value = 0;
	void intc(MyCounter ctr){
		ctr.value = ctr.value +1;
	}
}
