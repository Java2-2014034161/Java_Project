package FE_Override;

public class Point {
	private int x=0;
	private int y=0;
	
	//생성자
	public Point(int a, int b){
		x = a;	
		y = b;
	}	//매개변수와 필드가 다를 때는 this. 안써줘도 된다
	
	/*매개변수와 필드가 같다면..
	 * public Point(int x, int y){
	 * this.x = x;
	 * this.y = y;
	 * }
	 */
}
