import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice3G {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("A", 175, 0.3),
				new PhyscData("B", 174, 0.4), new PhyscData("C", 171, 0.8),
				new PhyscData("D", 179, 1.0), new PhyscData("E", 168, 1.2),
				new PhyscData("F", 156, 1.6), new PhyscData("G", 159, 2.0), };

		System.out.println("視力がいくつの人を探しますか：");
		double vision = sca.nextDouble();
		int A = Arrays.binarySearch(x, new PhyscData("", 0, vision),
				PhyscData.VISION_ORDER);

		if (A < 0)
			System.out.println("その値の要素は存在しません");
		else {
			System.out.println("その値はx[" + A + "]にあります");
			System.out.println("データ：" + x[A]);
		}
	}

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

		private static class VisionOrderComparator implements
				Comparator<PhyscData> {

			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? 1
						: (d1.vision < d2.vision) ? -1 : 0;

			}
		}

	}

}
