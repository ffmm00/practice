import java.util.Scanner;

public class PracticeK {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
