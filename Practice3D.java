import java.util.Scanner;

public class Practice3D {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.println("要素数：");
		int n = sca.nextInt();
		int[] x = new int[n];

		System.out.println("昇順に入力して下さい");

		System.out.print("x[0]:");
		x[0] = sca.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sca.nextInt();
		}

		System.out.println("探す値：");
		int ky = sca.nextInt();
		int A = binSearch(x, n, ky);

		if (A == -1)
			System.out.println("存在しません");
		else
			System.out.println("その値はx[" + A + "]にあります");

	}

	static int binSearch(int[] a, int n, int key) {
		int st = 0;
		int gl = n - 1;

		System.out.print("   |");
		for (int i = 0; i < n; i++)
			System.out.printf("%4d", i);
		System.out.println();

		System.out.print("---+");
		for (int i = 0; i < 4 * n; i++)
			System.out.printf("-");
		System.out.println();

		do {
			System.out.print("   |");
			int cen = (st + gl) / 2;

			if (st != cen)
				System.out.printf(String.format("%%%ds<-%%%ds+", (st * 4) + 1,
						(cen - gl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", cen * 4 + 1), "");

			if (gl != cen)
				System.out.printf(String.format("%%%ds->\n", cen * 4 -2), "");
			else
				System.out.println("->");

			System.out.printf("%3d|", cen);
			for (int i = 0; i < n; i++)
				System.out.printf("%4d", a[i]);
			System.out.println("\n   |");

			if (a[cen] == key)
				return cen;
			else if (a[cen] < key)
				st = cen + 1;
			else
				gl = cen - 1;
		} while (st <= gl);

		return -1;

	}

}
