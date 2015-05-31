import java.util.Scanner;

public class PracticeH {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int t = 0;

		while (n > 0) {
			n /= 10;
			t++;
		}

		System.out.println(t + "桁です");
	}

}
