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

// public class Exercise {
// 	public static void main(String[] args) {
// 		int x = 1;
// 		for (int i = 1; i <= 8; i++) {
// 			x *= 2;
// 			System.out.println("2の" + i + "乗=" + x);
// 		}
// 	}
// }

// 7 の階乗を計算し、表示するプログラムを作成しなさい。

// public class Exercise {
// 	public static void main(String[] args) {
// 		int x = 1;
// 		for( int i = 1; i <= 7 ; i++ )
// 		    x *= i;
// 		System.out.println( x );
		// int total = 1;
		// for (int i = 7; i >= 7; i--) {
		// 	System.out.println(i * total);
// 		// }
// 	}
// }


// 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。

// public class Exercise {
// 	public static void main(String[] args) {
// 		// int integer = new java util .Scanner(System.in).nextInt();
// 		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
// 		int sum = 0;
		
// 		for (int i = 0; i <= 10; i++) {
// 			// int total += integer;
// 			int value = Integer.parseInt( br.readLine() );
// 			sum += value;
// 		}
// 		// System.out.println(total / 10);
// 		System.out.println( "平均は" + ( sum / 10 ) );

// 	}
// }

import java.util.*;

public class Exercise {
	public static void main(String[] args) {
BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
int sum = 0;

for( int i = 0 ; i < 10 ; i++ )
{
    int value = Integer.parseInt( br.readLine() );
    sum += value;
}

System.out.println( "平均は" + ( sum / 10 ) );
}
}