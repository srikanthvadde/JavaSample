package sampletest;

public class Animal {

	protected static Integer value;

	Integer count(Integer i) {
		value = i;
		return value;
	}

	void swim() {
		System.out.println("Animal cant swim"+"\n");
		count(0);
	}

	void fly() {
		System.out.println("Animal cant flying"+"\n");
		count(0);
	}

	void sing() {
		System.out.println("Animal Cant sing"+"\n");
		count(0);
	}

	void walk() {
		System.out.println("Animal Can walk"+"\n");
		count(1);

	}

}

