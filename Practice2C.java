import java.util.Scanner;

public class Practice2C {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int N = sca.nextInt();
		int[] x = new int[N];

		for (int i = 0; i < N; i++)
			x[i] = sca.nextInt();

		System.out.println(sumOf(x));
	}

	static int sumOf(int[] a) {
		int M = a[0];
		for (int i = 1; i < a.length; i++) {
			M += a[i];
		}
		return M;

	}
}
