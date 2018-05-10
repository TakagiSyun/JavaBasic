package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("０〜６の数字を入れてください");
		String line = scanner.nextLine();
		int num = Integer.parseInt(line);
		switch(num) {
		case 0:
			System.out.println("日");
			break;
		case 1:
			System.out.println("月");
			break;
		case 2:
			System.out.println("火");
			break;
		case 3:
			System.out.println("水");
			break;
		case 4:
			System.out.println("木");
			break;
		case 5:
			System.out.println("金");
			break;
		case 6:
			System.out.println("土");
			break;
		default:
			System.out.println("０〜６の整数を入れてください");
		
		}
	}
}
