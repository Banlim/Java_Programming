
public class RandomAverage {

	public static void main(String[] args) {
		int [] randomInt = new int[10];
		int sum = 0;
		double average = 0;
		
		System.out.print("·£´ıÇÑ Á¤¼öµé : ");
		for (int i = 0; i < randomInt.length; i++) {
			randomInt[i] = (int)(Math.random()*10 + 1);
			System.out.print(randomInt[i] + " ");
			sum = sum + randomInt[i];
		}
		average = sum/randomInt.length;
		System.out.print("\n Æò±ÕÀº : " + average);
	}

}
