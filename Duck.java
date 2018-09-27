package sampletest;

public class Duck extends Bird{
	
	@Override
	public void sing() {
		System.out.print("Quack,Quack");
		count(1);
	}

	@Override
	public void swim() {
		System.out.print("Duck can swim");
		count(1);
	}


}
