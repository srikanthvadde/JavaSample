package sampletest;

public class Parrot extends Bird {

	<T> void sing(Class<T> c) {

		if (c.getName().equals(new Dog().getClass().getName())) {
			System.out.println("bow bow");
			count(1);

			// or we can create method in dog class and inside method we can write the
			// business logic
		} else if (c.getName().equals(new Cat().getClass().getName())) {
			System.out.println("meow meow");
			count(1);

			// or we can create method in cat class and inside method we can write the
			// business logic
		} else if (c.getName().equals(new Duck().getClass().getName())) {
			System.out.println("Quack Quack");
			count(1);

			// or we can create method in duck class and inside method we can write the
			// business logic
		} else {
			System.out.println("Roaster");
			count(1);

			// or we can create method in roaster class and inside method we can write the
			// business logic
		}
	}

}
