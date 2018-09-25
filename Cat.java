package sampletest;

public class Cat extends Parrot {
	protected static Integer value =0;
	
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
