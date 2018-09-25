package sampletest;

public class Chicken extends Animal{
	
	protected static final String gender="F";
protected static Integer value =0;
	
	@Override
	Integer count(Integer i) {
		System.out.println("Count");
		super.setValue(i);
		return value;
	}
	
	



	@Override
	void sing() {
		System.out.println("Cluck,cluck");
		count(1);
	}
	
	@Override
	public void fly() {
		System.out.print("i Cannot fly");
		count(0);
	}

	

	
}
