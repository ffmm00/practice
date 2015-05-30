import java.util.Scanner;

public class PracticeA {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int A = sca.nextInt();
		int B = sca.nextInt();
		int C = sca.nextInt();
		int D = sca.nextInt();

		System.out.println(max4(A, B, C, D));
		System.out.println(min3(A, B, C));
		System.out.println(min4(A, B, C, D));

	}

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		return min;
	}
}
