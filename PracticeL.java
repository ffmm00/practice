import java.util.Scanner;

public class PracticeL {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		traiangleLB(5);
		traiangleLU(5);
		traiangleRU(5);
		traiangleRB(5);
	}

	static void traiangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	static void traiangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}

	static void traiangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();

		}
	}

	static void traiangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();

		}

	}

}
