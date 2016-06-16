package FE_callbyvalue;

public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCounter obj = new MyCounter();
		
		System.out.println("obj.value = " + obj.value);
		obj.intc(obj);
		System.out.println("obj.value = " + obj.value);
	}

}
