// “SPAM”という単語を 10 回表示するプログラムを作成しなさい。

// public class Exercise {
// 	public static void main(String[] args) {
// 	  for (int i = 0; i < 10; i++)
// 	    System.out.println("SPAM");
// 	}
// }

// 九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。

// public class Exercise {
// 	public static void main(String[] args) {
// 		for (int i = 1; i <= 9; i++)
// 		System.out.println(3*i);
// 	}
// }


//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。

public class Exercise {
	public static void main(String[] args) {
		int x = 1;
		for (int i = 1; i <= 8; i++) {
			x *= 2;
			System.out.println("2の" + i + "乗=" + x);
		}
	}
}