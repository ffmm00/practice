import java.util.Scanner;

public class PracticeF {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int x = sca.nextInt();
		int y = sca.nextInt();
		System.out.println(sumof(x, y));

	}

	static int sumof(int a, int b) {
		int sum2 = 0;

		if (a >= b) {
			for (int i = b; i <= a; i++)
				sum2 += i;
		} else {
			for (int i = a; i <= b; i++)
				sum2 += i;
		}
		return sum2;

	}

}
