package practice13.common;

public class superHero extends Hero{

	public Iteme eqipment;

	public int attack() {
		return super.attack()+eqipment.getAdditional();
	}
	public void setEqipment(Iteme eqip) {
		this.eqipment=eqip;
	}
}
