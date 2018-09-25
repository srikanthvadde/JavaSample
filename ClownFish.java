package sampletest;

public class ClownFish extends Fish{
protected static Integer value =0;
	
	@Override
	Integer count(Integer i) {
		System.out.println("Count");
		super.setValue(i);
		return value;
	}
	
	
	@Override
	void swim() {
		System.out.println("ClownFish dont swim");
		count(0);
	}
	
	@Override
	public void sing() {
		System.out.print("ClownFish dont sing");
		count(0);
	}

	
	@Override
	public void walk() {
		System.out.print("ClownFish dont walk");
		count(0);
	}
	

	public void apperence() {
		System.out.print("ClownFish are small and Colourful");
	}

	public void sofHumor() {
		System.out.print("ClownFish Makes Jokes");
	}


}
