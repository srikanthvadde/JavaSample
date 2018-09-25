package sampletest;

public class Dolphin extends Animal{
	protected static Integer value =0;
	
	 @Override
	void swim() {
		System.out.println("Dolphin can swim");
		count(1);
	}
	
	 @Override
	public void sing() {
		System.out.print("Dolphin dont sing");
		count(0);
	}
	 
	
	
	 @Override
	public void walk() {
		System.out.print("Dolphin dont walk");
		count(0);
	}

	 @Override
	   	public void fly() {
	   		System.out.print("Dolphin can fly");
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
