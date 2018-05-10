package practice13.common;

public class Iteme {
	private String name;

	private int additionalDamage;

	public String getItemeNm() {
		return this.name;
	}

	public int getAdditional() {
		return this.additionalDamage;
	}

	public Iteme(String str,int x) {
		this.name=str;
		this.additionalDamage=x;
	}

		public void setItemNm(String str) {
			this.name=str;
	}
		public void setItemAdd(int x) {
			this.additionalDamage=x;
		}
}
