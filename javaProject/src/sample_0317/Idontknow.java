package sample_0317;

public class Idontknow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=2; i++){		
			for(int j = 1; j<=3; j++){
				System.out.println(i);
				System.out.println(j);
			}
		}

		for(int b = 1; b<10; b++){
			for(int a = 3; a<10; a+=2){
				System.out.print(a);
				System.out.print("*");
				System.out.print(b);
				System.out.print("=");
				System.out.print(a*b);
				System.out.println("  ");
			}
			System.out.println("  ");
		}
		
		for(int x=8; x>=1; x--){
			for(int y=1; y<=9; y++){
				System.out.print(x*1000+y);
				System.out.print("  ");
				
			}
			System.out.println(" ");
		}
	}

}
