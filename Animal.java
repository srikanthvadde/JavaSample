package sampletest;

public class Animal {

	protected static Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	void walk() {
		System.out.println("I am walking");
		
	}
	
	
	Integer count(Integer i) {
		System.out.println("Count");
		return value;
	}
	
void swim()
{
	System.out.println("I am swimming");
}

void fly()
{
	System.out.println("I am flying");
}


void sing()
{
System.out.println("I am singing");
}






	 
}

