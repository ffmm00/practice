import java.util.Scanner;

public class Practice3H {

	static class Data {
		Scanner sca = new Scanner(System.in);

		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		String keyCode() {
			return name;
		}

		public String toString() {
			return Integer.toString(no);
		}

		void scanData(String guide, int sw) {
			System.out.println(guide + "するデータを入力してください");

			if ((sw & NAME) == NAME) {
				System.out.print("名前：");
				name = sca.next();
			}
			if ((sw & NO) == NO) {
				System.out.print("番号：");
				no = sca.nextInt();
			}
		}
	}

	enum Menu {

		ADD("データ追加"), REMOVE("データ削除"), SEARCH("データ探索"), DUMP("全データ表示"), TERM(
				"終了");

		private final String message;

		static Menu MenuAt(int idx) {
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {
			message = string;
		}

		String getMessage() {
			return message;
		}
	}

	static Menu SelectMenu() {
		Scanner sca = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2
						&& m.ordinal() != Menu.TERM.ordinal())
					System.out.println();
			}
			System.out.print(":");
			key = sca.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERM.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data temp = new Data();

		practice3H_hash<String, Data> hash = new practice3H_hash<String, Data>(13);

		do {
			switch (menu = SelectMenu()) {
			case ADD:
				data = new Data();
				data.scanData("追加", Data.NO | Data.NAME);
				int k = hash.add(data.keyCode(), data);
				switch (k) {
				case 1:
					System.out.println("そのキー値は登録済みです");
					break;
				case 2:
					System.out.println("ハッシュ表が満杯です");
					break;
				}
				break;

			case REMOVE:
				temp.scanData("削除", Data.NAME);
				hash.remove(temp.keyCode());
				break;

			case SEARCH:
				temp.scanData("探索", Data.NAME);
				Data t = hash.search(temp.keyCode());
				if (t != null)
					System.out.println("そのキーをもつデータは" + t + "です");
				else
					System.out.println("該当するデータはありません");
				break;

			case DUMP:
				hash.dump();
				break;

			}
		} while (menu != Menu.TERM);

	}

}
