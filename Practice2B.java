import java.util.Scanner;

public class Practice2B {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int num = sca.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; i++)
			a[i] = sca.nextInt();

		for (int i = 0; i < num; i++)
			System.out.print(a[i] + " ");

		for (int i = 0; i < num / 2; i++) {
			System.out.println("\r\na[" + i + "]とa[" + (num - i - 1) + "]を交換します");
			swap(a, i, num - i - 1);
			for (int k = 0; k < num; k++)
				System.out.print(a[k] + " ");
		}

		System.out.println("\r\n逆転が終了しました");

	}

	static void swap(int[] a, int b, int c) {
		int t = a[b];
		a[b] = a[c];
		a[c] = t;
	}

}
