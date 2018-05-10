package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars=new Car[3];
		Car car0=new Car();
		Car car1=new Car();
		Car car2=new Car();
		cars[0]=car0;
		cars[0].color="blue";
		cars[0].gasoline=100;
		cars[1]=car1;
		cars[1].color="red";
		cars[1].gasoline=70;
		cars[2]=car2;
		cars[2].color="yellow";
		cars[2].gasoline=150;
		
		for(int i=0;i<cars.length;i++) {
			final int distance = 300;
			int distanceWalked=0;
			int count=0;
			
			while(true) {
				
				int dis=cars[i].run();
				distanceWalked+=dis;
				count++;
				
				if(dis==-1) {
					System.out.println("到達できませんでした");
					break;
				}
				if(distance<distanceWalked) {
					System.out.println("目的地までに"+count+"時間かかりました。残りのガソリンは"+(cars[i].gasoline)+"リットルです");
					break;
				}
			}
		}

	}
}
