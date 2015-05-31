import java.util.Scanner;

public class PracticeG {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b;
		System.out.println("aの値:" + a);

		do {
			System.out.print("bの値:");
			b = sca.nextInt();
		} while (a > b);

		System.out.println(b - a);

	}

}
