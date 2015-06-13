import java.util.Scanner;

public class Practice4A {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		Practice4A_IntStack s = new Practice4A_IntStack(100);

		while (true) {
			System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());
			System.out.print("(1)プッシュ  (2)ポップ  (3)ピーク  (4)ダンプ  (5)探索  "
					+ "(6)全削除  (7)残り容量  (8)空  (9)満杯  (0)終了");

			int menu = sca.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {

			case 1:
				System.out.print("データ：");
				x = sca.nextInt();
				try {
					s.push(x);
				} catch (Practice4A_IntStack.OverflowIntStackException e) {
					System.out.println("スタックは満杯です");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("ポップしたデータは" + x + "です");
				} catch (Practice4A_IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("ピークしたデータは" + x + "です");
				} catch (Practice4A_IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です");
				}
				break;

			case 4:
				s.dump();
				break;

			case 5:
				System.out.print("探索するデータ：");
				x = sca.nextInt();
				s.indexOf(x);
				if (x == -1)
					System.out.println("その値は存在しません");
				else
					System.out.println("その値はstk[" + x + "]です");
				break;

			case 6:
				System.out.println("スタックを空にします");
				s.clear();
				break;

			case 7:
				System.out.println("残り容量は" + (s.capacity()-s.size()) + "です");
				break;

			case 8:
				System.out.println(s.isEmpty() ? "スタックは空です" : "スタックは空ではありません");
				break;

			case 9:
				System.out.println(s.isFull() ? "スタックは満杯です" : "スタックは満杯ではありません");
				break;

			}

		}
	}
}
