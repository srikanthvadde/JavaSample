package sampletest;

public class Butterfly extends Animal{
	protected static Integer value =0;
	
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
