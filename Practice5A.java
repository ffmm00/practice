import java.util.Scanner;

public class Practice5A {

	static int Factorial(int n) {
		int x = 1;
		for (int i = n; i >= 1; i--)
			x *= i;
		return x;
	}

	static int GCD(int x, int y) {
		while (y != 0) {
			int t = y;
			y = x % y;
			x = t;
		}
		return x;
	}

	static int gcdArray(int[] a, int x, int n) {

		if (n == 1)
			return a[x];
		else if (n == 2)
			return GCD(a[x], a[x + 1]);
		else
			return GCD(a[x], gcdArray(a, x + 1, n - 1));

	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int a = sca.nextInt();
		// int b = sca.nextInt();

		// System.out.println(Factorial(a));
		// System.out.println(GCD(a, b));

		int[] x = new int[a];
		for (int i = 0; i < a; i++)
			x[i] = sca.nextInt();

		System.out.println(gcdArray(x, 0, a));

	}

}
