
public class ThreeSixNinePrint {

	public static void main(String[] args) {
		int one = 0;
		int ten = 0;
		int number369 = 0;
		String [] str = {"¹Ú¼ö Â¦", "¹Ú¼ö Â¦Â¦"};
		
		for (int i = 0; i < 100; i++) {
			one = i%10;
			if (one == 3 || one == 6 || one ==9) {
				number369++;
			}
			ten = i/10;
			if (ten == 3 || ten == 6 || ten == 9) {
				number369++;
			}
			if (number369 > 0) {
				System.out.print(i + " " + str[number369-1] + "\n");
			}
			number369 = 0;
		}

	}

}
