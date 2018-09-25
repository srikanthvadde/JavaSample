package sampletest;

public class Fish extends Animal{
	protected static Integer value =0;


	<T> void getDeatils(Class<T> c) {
		Shark s= new Shark();
		ClownFish f = new ClownFish();
		if(c.getName().equals(s.getClass().getName())) {
			s.apperence();
			f.sofHumor();
			
			
			//or we can create method in dog class and inside method  we can write the business logic
		}else if(c.getName().equals(f.getClass().getName())) {
			f.apperence();
			f.sofHumor();
			
			//or we can create method in cat class and inside method  we can write the business logic
		}
	}

	
	
	
	
	
	
	@Override
	void swim() {
		System.out.println("Fish dont swim");
		count(0);
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

    
    @Override
   	public void fly() {
   		System.out.print("Fish can fly");
   		count(1);
   		
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
	



	

}
