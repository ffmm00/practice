import java.util.Scanner;

public class Practice2F {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int num, sin, dno;
		char[] kt = new char[32];
		int C = 0;

		System.out.println("10進数を基数変換します");
		System.out.println("変換する正の整数：");

		do {
			num = sca.nextInt();
		} while (num < 0);

		System.out.println("何進数に変換しますか");
		do {
			sin = sca.nextInt();
		} while (sin < 2 || 36 < sin);

		dno = cardConv(num, sin, kt);

		System.out.println(sin + "進数では");
		for (int i = 0; i < dno; i++)
			System.out.print(kt[i]);
		System.out.println("です");
	}

	static int cardConv(int x, int y, char[] d) {
		int n = ((Integer) x).toString().length();
		int A = 0;
		String B = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf(String.format("%%2d | %%%dd\n", n), y, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / y != 0)
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n),
						y, x / y, x % y);
			else
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x
						/ y, x % y);

			d[A++] = B.charAt(x % y);
			x /= y;
		} while (x != 0);

		for (int i = 0; i < A / 2; i++) {
			char temp = d[i];
			d[i] = d[A - i - 1];
			d[A - i - 1] = temp;
		}
		return A;

	}

}
