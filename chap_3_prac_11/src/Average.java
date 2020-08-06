
public class Average {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0.0;
		
		for (int i = 0; i < args.length; i++)
			sum += Integer.parseInt(args[i]);
		
		average = (double)sum/args.length;
		System.out.print(average);
	}

}
