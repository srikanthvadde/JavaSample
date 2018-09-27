package sampletest;

public class Shark extends Fish {

	@Override
	void swim() {
		System.out.println("Shark can swim");
		count(0);
	}

	@Override
	public void walk() {
		System.out.print("Shark dont walk");
		count(0);
	}

	public void apperence() {
		System.out.print("Shark are Larze and grey");
	}

	public void sofHumor() {
		System.out.print("Shark eat Other fishes");
	}

	@Override
	public void fly() {
		System.out.print("Shark can fly");
		count(1);

	}

}
