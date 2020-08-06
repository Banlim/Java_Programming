
public class ArrayNPrint {

	public static void main(String[] args) {
		int [][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		int result = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				result = n[i][j];
				System.out.print("n["+i+"]["+j+"]의 배열 값은 " + result +"\n");
			}
		}
		
		
	}

}
