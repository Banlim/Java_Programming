import java.util.Scanner;

public class RandomArrayPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개? ");
		int n = scan.nextInt();
		
			int [] intArray = new int[n];
			
			for (int i = 0; i < intArray.length; i++) {
				intArray[i] = (int)(Math.random()*100 + 1);
				for (int j = 0; j < i; j++) {
					if(intArray[i] == intArray[j]) {
						i--;
						break;
					}
				}
			}
			
			for (int k = 0; k < intArray.length; k++){
					System.out.print(intArray[k] + " ");
					if (k != 0 && k%10 == 0)
						System.out.print("\n");
				}
			
		
			scan.close();
	}

}
