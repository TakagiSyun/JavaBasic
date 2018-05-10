/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;
	
	public void setField(int x,String N,String C,String CN,String M,String P) {
		this.studentId=x;
		this.studentName=N;
		this.companyName=C;
		this.className=CN;
		this.mail=M;
		this.password=P;
	}
	public String getstudentId() {
		StringBuilder str = new StringBuilder();

		str.append(this.studentId);
		str.append(this.studentName);
		str.append(this.companyName);
		str.append(this.className);
		str.append(this.mail);
		str.append(this.password);
		

		return str.toString();
	    } 
	}
		