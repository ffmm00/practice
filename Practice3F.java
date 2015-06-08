import java.util.Arrays;
import java.util.Scanner;

public class Practice3F {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		System.out.println("要素数：");
		int num = sca.nextInt();
		int[] x = new int[num];

		System.out.println("昇順に入力してください");
		for (int i = 0; i < num; i++)
			x[i] = sca.nextInt();

		System.out.println("探す値：");
		int ky = sca.nextInt();

		int A = Arrays.binarySearch(x, ky);

		if (A < 0) {
			System.out.println("その値は存在しません");
			System.out.println("挿入ポイントは" + (Math.abs(A) - 1) + "です");
		} else
			System.out.println("その値はx[" + A + "]にあります");

	}

}
