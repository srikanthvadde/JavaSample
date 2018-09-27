package sampletest;

public class Dolphin extends Fish {

	@Override
	void swim() {
		System.out.println("Dolphin can swim");
		count(1);
	}

	@Override
	public void fly() {
		System.out.print("Dolphin can fly");
		count(1);
	}

}
