import java.util.Scanner;

public class Practice2E {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int nu, sn, kt, tw;
		char[] p = new char[32];

		do {
			do {
				System.out.print("変換する正の整数：");
				nu = sca.nextInt();
			} while (nu < 0);

			do {
				System.out.print("何進数に変換しますか(2～36)");
				sn = sca.nextInt();
			} while (sn < 2 || sn > 36);

			kt = cardConv(nu, sn, p);

			System.out.print(sn + "進数では");
			for (int i = 0; i < kt; i++)
				System.out.print(p[i]);
			System.out.println("\r\nもう一度しますか(1･･･はい。2･･･いいえ。)");
			tw = sca.nextInt();
		} while (tw == 1);
	}

	static int cardConv(int x, int r, char[] d) {
		int a = 0;
		String b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[a++] = b.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < a / 2; i++) {
			char temp = d[i];
			d[i] = d[a - i - 1];
			d[a - i - 1] = temp;
		}
		return a;

	}
}
