import java.util.Scanner;

public class Practice2D {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int N = sca.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];

		for (int i = 0; i < N; i++)
			y[i] = sca.nextInt();

		copy(x, y);// x = y.clone();にならない

		for (int i = 0; i < N; i++)
			System.out.print(x[i]);

	}

	static void copy(int[] a, int[] b) {
		a = b.clone();

	}

}
