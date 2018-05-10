package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users=new User[3];
		User user0=new User();
		User user1=new User();
		User user2=new User();
		users[0]=user0;
		users[1]=user1;
		users[2]=user2;
		
		
		


		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner=new java.util.Scanner(System.in);


		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		int count=1;
		for(int i=0;i<users.length;i++) {

			System.out.println(count+"人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line=scanner.nextLine();


			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] Line=line.split(",", 0);


			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			int ID=Integer.parseInt(Line[0]);
			users[i].userID=ID;
			users[i].userNm=Line[1];
			users[i].mail=Line[2];
			users[i].password=Line[3];
			
			count++;
			


		//----------- ループ end
		}

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i].userID);
			System.out.println(users[i].userNm);
			System.out.println(users[i].mail);
			System.out.println(users[i].password);
		}

	}
}
