package sampletest;

public class Bird extends Animal {
	private String gender = "M";

	@Override
	void fly() {
		System.out.println("I am Flying" + "\n");
		count(1);
	}

	@Override
	Integer count(Integer i) {
		Animal.value = i;
		return value;
	}

	@Override
	public void sing() {
		System.out.print("I am singing" + "\n");
		count(1);
	}

	@Override
	public void swim() {
		System.out.print("Bird wont swim" + "\n");
		count(0);
	}

	@Override
	public void walk() {
		System.out.print("Bird can walk" + "\n");
		count(1);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
