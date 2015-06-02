import java.util.Random;
import java.util.Scanner;

public class Practice2A {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sca = new Scanner(System.in);

		int n = 1 + rand.nextInt(6);
		int[] height = new int[n];

		for (int i = 0; i < n; i++) {
			height[i] = 100 + rand.nextInt(91);
			System.out.println("height[" + i + "]:" + height[i]);
		}
		System.out.println("最大は" + maxof(height));

	}

	static int maxof(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;

	}

}
