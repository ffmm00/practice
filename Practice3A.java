import java.util.Scanner;

public class Practice3A {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("要素数:");
		int num = sca.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sca.nextInt();
		}

		System.out.print("探す値:");
		int ky = sca.nextInt();

		int A = seqSearchSen(x, num, ky);

		if (A == -1)
			System.out.println("存在しません");
		else
			System.out.println("x[" + A + "]にあります");

	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key;
		for (i = 0; a[i] != key; i++)
			;
		return i == n ? -1 : i;

	}

}
