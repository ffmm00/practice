import java.util.Scanner;

public class Practice3B {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] x = new int[n];

		System.out.println("要素数：");

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sca.nextInt();
		}

		System.out.println("探す数字：");
		int ky = sca.nextInt();

		int A = seqSearchSen(x, n, ky);

		if (A == -1)
			System.out.println("その値の要素は存在しません。");
		else
			System.out.println("その値は" + "x[" + A + "]にあります。");

	}

	static int seqSearchSen(int[] a, int n, int key) {
		System.out.print("   |");
		for (int i = 0; i < n; i++)
			System.out.printf("%4d", i);
		System.out.println();

		System.out.print("---+");
		for (int i = 0; i < 4 * n + 2; i++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");

			if (a[i] == key)
				return i;
		}
		return -1;
	}
}
