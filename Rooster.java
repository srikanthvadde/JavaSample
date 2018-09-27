package sampletest;

public class Rooster extends Parrot {

	protected static final String gender = "M";

	@Override
	public void fly() {
		System.out.println("I canot fly");
		count(0);

	}

	@Override
	public void sing() {
		System.out.print("cock-adoodle-doo");
		count(1);
	}

}
