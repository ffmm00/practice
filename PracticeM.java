public class PracticeM {

	public static void main(String[] args) {
		spira(4);
		npira(4);

	}

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int a = 1; a <= n - i; a++)
				System.out.print(" ");

			for (int b = 1; b <= (i - 1) * 2 + 1; b++)
				System.out.print("*");

			System.out.println();
		}
	}

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int a = 1; a <= n - i; a++)
				System.out.print(" ");

			for (int b = 1; b <= (i - 1) * 2 + 1; b++)
				System.out.print(i % 10);

			System.out.println();
		}
	}
}
