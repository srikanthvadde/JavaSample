package sampletest;

public class Shark extends Fish{
	protected static Integer value =0;
	
	@Override
	void swim() {
		System.out.println("Shark dont swim");
		count(0);
	}
	
	@Override
	public void sing() {
		System.out.print("Shark dont sing");
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
	 
	 @Override
		Integer count(Integer i) {
			System.out.println("Count");
			super.setValue(i);
			return value;
		}


	    @Override
		public Integer getValue() {
			return value;
		}

	@Override
		public void setValue(Integer value) {
			this.value = value;
		}
		



}
