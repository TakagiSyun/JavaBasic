package entity;

public class Player {
	private String position;
	private String name;
	private String country;
	private String team;

	public void setPosition(String str) {
		this.position=str;
	}
	public void setName(String str) {
		this.name=str;
	}
	public void setCountry(String str) {
		this.country=str;
	}
	public void setTeam(String str) {
		this.team=str;
	}

	public String getPosition() {
		return this.position;
	}
	public String getName() {
		return this.name;
	}
	public String getCountry() {
		return this.country;
	}
	public String getTeam() {
		return this.team;
	}

	public String toString() {
		return position+","+name+","+country+","+team;
	}











}
