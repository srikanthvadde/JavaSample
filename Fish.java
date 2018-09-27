package sampletest;

public class Fish extends Animal {
	
	<T> void getDeatils(Class<T> c) {
		Shark s = new Shark();
		ClownFish f = new ClownFish();
		if (c.getName().equals(s.getClass().getName())) {
			s.apperence();
			f.sofHumor();
		} else if (c.getName().equals(f.getClass().getName())) {
			f.apperence();
			f.sofHumor();
		}
	}

	@Override
	void swim() {
		System.out.println("Fish Can swim");
		count(1);
	}

	@Override
	public void sing() {
		System.out.print("Fish dont sing");
		count(0);
	}

	@Override
	public void walk() {
		System.out.print("Fish dont walk");
		count(0);
	}

}
