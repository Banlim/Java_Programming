
public class twoDzeroPrint {

	public static void main(String[] args) {
		int [][] n = new int[4][4];
		int count = 0;
		
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j <n[i].length; j++) {
				n[i][j] = 0;
			}
		}
		while(count < 10) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			if (n[row][col] != 0) 
				continue;
			else {
				n[row][col] = (int)(Math.random()*9+1);
				count++;
			}
			
		}
		for (int k = 0; k < n.length; k++) {
			for (int l = 0; l < n[k].length; l++)
				System.out.print(n[k][l] + "   ");
			System.out.print("\n");
		}
				
	}

}
