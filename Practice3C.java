import java.util.Scanner;

public class Practice3C {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("要素数：");
		int n = sca.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]");
			a[i] = sca.nextInt();
		}

		System.out.println("探す数字");
		int k = sca.nextInt();

		int c = searchIdx(a, n, k, b);

		if (c == 0)
			System.out.println("要素は存在ません");
		else {
			for (int i = 0; i < c; i++)
				System.out.println("x[" + b[i] + "]にあります");
		}

	}

	static int searchIdx(int[] a, int n, int key, int[] indx) {
		int c = 0;

		for (int i = 0; i < n; i++)
			if (a[i] == key)
				indx[c++] = i;

		return c;

	}

}
