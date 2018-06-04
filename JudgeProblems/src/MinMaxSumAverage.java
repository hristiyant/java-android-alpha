import java.util.Scanner;

public class MinMaxSumAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double min = Float.MAX_VALUE;
		double max = -min;
		double sum = 0;

		for (int i = 0; i < n; i++) {
			double current = input.nextDouble();
			min = Math.min(min, current);
			max = Math.max(max, current);
			sum += current;
		}
		System.out.printf("min=%.2f\n", min);
		System.out.printf("max=%.2f\n", max);
		System.out.printf("sum=%.2f\n", sum);
		System.out.printf("avg=%.2f\n", sum / n);
	}

}
