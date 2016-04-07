package sample0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		myTv.channel = 18;
		myTv.volume = 12;
		myTv.onOff = true;	//1bit
		
		Television testTv = new Television();
		testTv = myTv;
		testTv.channel = 536;
		
		myTv.print();
		
		Television yourTv = new Television();
		yourTv.channel = 18;
		yourTv.volume = 12;
		yourTv.onOff = true;	//1bit
		
		System.out.println("current channel : " + yourTv.changeChannel(24));
		
		yourTv.print();
		
	}

}
