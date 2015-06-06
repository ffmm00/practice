import java.util.Scanner;

public class Practice2I {

	static class YMD {
		int y;
		int m;
		int d;

		static int[][] mdays = {
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

		static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1
					: 0;
		}

		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}

		YMD after(int n) {
			YMD tmp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (before(-n));

			tmp.d += n;
			while (tmp.d > mdays[isLeap(tmp.y)][tmp.m - 1]) {
				tmp.d -= mdays[isLeap(tmp.y)][tmp.m - 1];
				if (++tmp.m > 12) {
					tmp.y++;
					tmp.m = 1;
				}

			}
			return tmp;
		}

		YMD before(int n) {
			YMD tmp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (after(-n));

			tmp.d -= n;

			while (tmp.d < 1) {
				if (--tmp.m < 1) {
					tmp.y--;
					tmp.m = 12;
				}

				tmp.d += mdays[isLeap(tmp.y)][tmp.m - 1];
			}
			return tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		System.out.print("日付を入力してください\n");
		System.out.print("年：");
		int y = sca.nextInt();
		System.out.print("月：");
		int m = sca.nextInt();
		System.out.print("日：");
		int d = sca.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("何日前/後の日付を求めますか：");
		int n = sca.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d日後の日付は%d年%d月%d日です\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
		System.out.printf("%d日前の日付は%d年%d月%d日です\n", n, d2.y, d2.m, d2.d);

	}

}
