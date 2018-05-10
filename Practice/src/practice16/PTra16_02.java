/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean Bool=new Boolean(b);
		Byte By=new Byte(by);
		Short Sho=new Short(s);
		Character Chara=new Character(c);
		Integer Int=new Integer(i);
		Long Lo=new Long(l);
		Float Fl=new Float(f);
		Double D=new Double(d);
		
		System.out.println(Bool.toString());
		System.out.println(Chara.toString());
	}
}
