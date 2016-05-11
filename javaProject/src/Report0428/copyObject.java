package Report0428;

public class copyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] obj1 = {1, 2, 3, 4, 5};
		int[] obj2 = obj1;
		int i;
		
		for(i=0; i<5; i++){
			System.out.print(obj1[i]+" ");
		}
		System.out.println("");
		for(i=0; i<5; i++){
			System.out.print(obj2[i]+" ");
		}
	}

}
