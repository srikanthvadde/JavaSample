package sampletest;

public  class Bird extends Animal{
	protected static Integer value =0;

	void fly() {
		System.out.println("I am Flying");
		count(1);
	}
	
	@Override
	Integer count(Integer i) {
		System.out.println("Count");
		super.setValue(1);
		return 1;
	}
	
	
	public void sing() {
		System.out.print("I am singing");
		count(1);
	}
	
	
	public void walk() {
		System.out.print("I cant walk");
		count(0);
	}
	
	public Chicken getChicken() {
		return chicken;
	}

	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}


	public Rooster getRooster() {
		return rooster;
	}

	public void setRooster(Rooster rooster) {
		this.rooster = rooster;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


@Override
	public Integer getValue() {
		return value;
	}

@Override
	public void setValue(Integer value) {
		this.value = value;
	}

	private Chicken chicken = new Chicken();
	private Rooster rooster = new Rooster();

	
	
	private String gender ="M";

}
