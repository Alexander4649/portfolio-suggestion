★標準入力

import java util.* => データを読み込む為のライブラリを記述

Scanner sc = new Scanner(System.in); => プログラム外部からのデータを読み込む
String data = sc.next(); => nextメソッドを使用し、data変数にscの内容を代入
sc変数が標準入力の入り口になり、次行で使用したい変数に代入することで使用可能になる。

