package sampletest;

public class ClownFish extends Fish {

	@Override
	void swim() {
		System.out.println("ClownFish dont swim");
		count(0);
	}

	public void apperence() {
		System.out.print("ClownFish are small and Colourful");
	}

	public void sofHumor() {
		System.out.print("ClownFish Makes Jokes");
	}

}
