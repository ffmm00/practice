import java.util.Scanner;

public class Practice2H {

	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] D) {
		double sum = 0;
		for (int i = 0; i < D.length; i++)
			sum += D[i].height;
		return sum / D.length;
	}

	static void Vision(PhyscData[] D, int[] A) {

		for (int i = 0; i < D.length; i++) {
			if (D[i].vision >= 0.0 && D[i].vision <= VMAX / 10.0)
				A[(int) (D[i].vision * 10)]++;
		}
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("A", 162, 0.3),
				new PhyscData("B", 173, 0.7), new PhyscData("C", 175, 2.0),
				new PhyscData("D", 171, 1.5), new PhyscData("E", 168, 0.4),
				new PhyscData("F", 174, 1.2), new PhyscData("G", 169, 1.2), };

		int[] vdist = new int[VMAX];

		System.out.println("■ 身体検査一覧表 ■");
		System.out.println("氏名       身長 視力");
		System.out.println("---------------------");

		for (int i = 0; i < x.length; i++)
			System.out.printf("%-11s%3d%5.1f\n", x[i].name, x[i].height,
					x[i].vision);

		Vision(x, vdist);

		System.out.println("視力の分布");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f～:", i / 10.0);
			for (int k = 0; k < vdist[i]; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}
}
