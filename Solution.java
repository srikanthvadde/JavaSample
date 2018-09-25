package sampletest;

public class Solution extends Animal {

	public static void main(String... strings) {

		// 1st answer
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		// 2 nd answer* one way to print */
		Duck d = new Duck();
		d.sing();
		d.fly();

		Chicken c = new Chicken();
		c.fly();
		c.sing();

		/* second way to print using Dynamic Binding Concept */
		Animal b1 = new Duck();

		b1.fly();
		b1.sing();

		// A.3rd answer
		if (bird.getGender().equals(bird.getChicken().gender)) {
			bird.getChicken().fly();
			bird.getChicken().sing();
		} else if (bird.getGender().equals(bird.getRooster().gender)) {
			bird.getRooster().fly();
			bird.getRooster().sing();
		}

		// A.4TH ANSWER

		Parrot p1 = new Dog();
		Parrot p2 = new Cat();
		Parrot p3 = new Rooster();

		p1.sing(p1.getClass());
		p2.sing(p2.getClass());
		p3.sing(p3.getClass());

		// B.1
		Animal f = new Fish();
		f.sing();
		f.swim();
		f.walk();

		// B.2
		Fish f1 = new Shark();
		Fish f2 = new ClownFish();

		f1.getDeatils(f1.getClass());
		f2.getDeatils(f2.getClass());

		// B.3
		Animal s = new Dolphin();
		s.swim();

		// D.1
		Animal butterfly = new Butterfly();

		butterfly.sing();
		butterfly.walk();

		// E.1
		Integer newcnt = 0;
		Integer newsingCount = 0;
		Integer newswimCount = 0;
		Integer newwalkCount = 0;
		for (int i = 0; i <= animals.length - 1; i++) {

			animals[i].fly();
			newcnt = newcnt + Animal.value;
			System.out.println(newcnt);

			animals[i].sing();
			newsingCount = newsingCount + Animal.value;
			System.out.println(newsingCount);

			animals[i].swim();
			newswimCount = newswimCount + Animal.value;
			System.out.println(newswimCount);

			animals[i].walk();
			newwalkCount = newwalkCount + Animal.value;
			System.out.println(newwalkCount);

		}

	}
		


private static final Animal[] animals = new Animal[] { new Bird(), new Duck(),new Chicken(),new Rooster(),new Parrot(),new Fish(),new Shark(),new Dolphin(),new ClownFish(),new Dog(),new Butterfly(),new Cat()};


}
