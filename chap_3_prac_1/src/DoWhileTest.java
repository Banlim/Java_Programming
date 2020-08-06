
public class DoWhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		do {
			if(i >= 99)
				break;
			sum = sum + i;
			i += 2;
		}
		while(true);
		System.out.print(sum);

	}

}
