package sampletest;

public class Chicken extends Bird {

	protected static final String gender = "F";

	@Override
	public void sing() {
		System.out.println("Cluck,cluck");
		count(1);
	}

	@Override
	public void fly() {
		System.out.print("Chicken  Cannot fly");
		count(0);
	}

}
