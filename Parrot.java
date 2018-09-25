package sampletest;

public class Parrot extends Animal{
	protected static Integer value =0;
	
	<T> void sing(Class<T> c) {
		
		if(c.getName().equals(new Dog().getClass().getName())) {
			System.out.println("bow bow");
		
			//or we can create method in dog class and inside method  we can write the business logic
		}else if(c.getName().equals(new Cat().getClass().getName())) {
			System.out.println("meow meow");
			
			//or we can create method in cat class and inside method  we can write the business logic
		}else if(c.getName().equals(new Duck().getClass().getName())) {
			System.out.println("Quack Quack");
			
			//or we can create method in duck class and inside method  we can write the business logic
		}else {
			System.out.println("Roaster");
		
			//or we can create method in roaster class and inside method  we can write the business logic
		}
	}

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
	
@Override
void swim() {
	System.out.println("parrot dont swim");
	count(0);
}

 @Override
public void sing() {
	System.out.print("parrot can sing");
	count(1);
}


@Override
public void walk() {
	System.out.print("parrot can walk");
	count(1);
}


@Override
	public void fly() {
		System.out.print("parrot can fly");
		count(1);
		
	}


}
