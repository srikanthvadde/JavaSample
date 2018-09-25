package sampletest;

public class Duck extends Animal{
	protected static Integer value =0;
	
	@Override
	void fly() {
		System.out.println("I Can not fly");
		count(0);
	}
	
	@Override
	Integer count(Integer i) {
		System.out.println("Count");
		super.setValue(value);
		return value;
	}
	
	@Override
	public void sing() {
		System.out.print("Quack,Quack");
		count(1);
	}

	@Override
	public void swim() {
		System.out.print("I can swim");
		count(1);
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
