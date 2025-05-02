public class Dog {
	protected int age;
	protected String name;
	protected boolean isAdopted;
	
	public Dog (int a, String name, boolean ad)
	{
		age = a;
		this.name = name;
		isAdopted = ad;
	}
	
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void increaseAge()
	{
		age++;
	}
	public String toString()
	{
		stateAge();
		if (isAdopted)
		{
			return "I, " + name + ", have been chosen!";
		}
		return "I haven't found a home yet. :(";
	}
	
	public boolean equals(Dog dawg)
	{
		if(this.age == dawg.age &&
		   this.name.equals(dawg.name) &&
		   this.isAdopted == dawg.isAdopted) 
		{
			return true;
		}
	return false;
	}

}
