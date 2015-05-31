import java.util.Scanner;

public class PracticeD {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int sum = 0;

		for (int i = 1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.print(n + "=" + (sum + n));

	}

}
