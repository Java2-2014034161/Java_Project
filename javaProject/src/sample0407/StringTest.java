package sample0407;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String proverb = "A barking dog";
		
		
		System.out.println("문자열의 길이 =" + proverb.length());
		
		System.out.println(proverb.concat (" never Bites!"));
		System.out.println(proverb.replace('b', 'B'));
		System.out.println(proverb.substring(2, 5));
		System.out.println(proverb.toUpperCase());
		System.out.println(proverb);

	}

}
