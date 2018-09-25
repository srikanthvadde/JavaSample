package sampletest;

public class Rooster extends Parrot{
	
	protected static final String gender ="M";
protected static Integer value =0;
	
	@Override
	Integer count(Integer i) {
		System.out.println("Count");
		super.setValue(i);
		return value;
	}
	
	
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
