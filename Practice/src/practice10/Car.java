package practice10;

public class Car {
	int seriaNo;
	String color;
	int gasoline;

	int run() {

		if (this.gasoline > 0) {
			this.gasoline -= 1;
			int limitNumber = 15;
			int random = 0;
			random = new java.util.Random().nextInt(limitNumber) + 1;
			return random;
		} else {
			return -1;
		}

	}
}
