package sampletest;

public class Butterfly extends Animal {
	@Override
	public void sing() {
		System.out.print("Butterfly doesnot make  Sound");
		count(0);
	}

	@Override
	public void fly() {
		System.out.print("Butterfly can fly");
		count(1);
	}

}
