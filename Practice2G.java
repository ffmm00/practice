import java.util.Scanner;

public class Practice2G {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("年内の経過日数は");
		System.out.print("年：");
		int y = sca.nextInt();
		System.out.print("月：");
		int m = sca.nextInt();
		System.out.print("日：");
		int d = sca.nextInt();

		System.out.print("年内で" + dayOfyear(y, m, d) + "目です");
		System.out.println("残り日数は" + LeftDaysOfYear(y, m, d) + "です");

	}

	static int[][] mdays = {
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfyear(int y, int m, int d) {
		m -= 1;

		while (m != 0)
			d += mdays[isLeap(y)][m--];
		return d;
	}

	static int LeftDaysOfYear(int y, int m, int d) {
		int A, B;

		if (isLeap(0) == 0) {
			A = 365 - dayOfyear(y, m, d);
			return A;
		} else {
			B = 366 - dayOfyear(y, m, d);
			return B;
		}

	}

}
