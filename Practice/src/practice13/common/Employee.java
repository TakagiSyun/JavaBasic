package practice13.common;

public class Employee extends Person{
	private String departmentNm;
	private int departmentCnt;


	public void setDepertmentNm(String str) {
		this.departmentNm=str;
	}
	public void setDepertmentCnt(int x) {
		this.departmentCnt=x;
	}

	public String getDepertmentNm() {
		return this.departmentNm;
	}
	public int getDepertmentCnt() {
		return this.departmentCnt;
	}


}
