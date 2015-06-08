import java.util.Scanner;

public class Practice3E {

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

		int A = binSearchX(x, n, ky);

		if (A == -1)
			System.out.println("その値の要素は存在しません。");
		else
			System.out.println("その値は" + "x[" + A + "]にあります。");

	}

	static int binSearchX(int[] a, int n, int key) {
		int st = 0;
		int gl = n - 1;

		do {
			int cen = (st + gl) / 2;
			if (a[cen] == key) {
				for (; cen > st; cen--)
					if (a[cen - 1] < key)
						break;
				return cen;
			} else if (a[cen] < key)
				st = cen + 1;
			else
				gl = cen - 1;
		} while (st <= gl);

		return -1;

	}

}
