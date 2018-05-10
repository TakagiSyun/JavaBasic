/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Iteme;
import practice13.common.Slime;
import practice13.common.superHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		superHero superH=new superHero();
		superH.setName("勇者（装備あり）");

		Slime slime=new Slime();
		slime.setName("スライム");


		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Iteme Item=new Iteme("こんぼう", 4);


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		superH.eqipment=Item;


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		int count=0;
		while(true) {
			count++;
			if(slime.damage(superH.attack())) {
				System.out.println("勇者はスライムに勝利しました");
				break;
			}
			count++;
			if(superH.damage(slime.attack())) {
				System.out.println("スライムは勇者に勝利した");
				break;

			}
		}
		System.out.println(count);
		System.out.println(superH.showParameter());
		System.out.println(slime.showParameter());



		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
