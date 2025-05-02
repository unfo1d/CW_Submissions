public class PuppyDog extends Dog {
	boolean isFedUpWithLife;
	
	public PuppyDog (int a, String n, boolean ad, boolean f)
	{
		super (a , n , ad);
		isFedUpWithLife = f;
	}
	
	public void stateAge()
	{
		System.out.print(name + " is " + age + " months old.");
	}
	
	public void feedPup()
	{
		isFedUpWithLife = true;
	}
	
	public void increaseAge()
	{
		super.increaseAge();
		isFedUpWithLife = false;
	}
	
	public String toString()
	{
		if(isFedUpWithLife)
		{
	     return super.toString() + "I'm fed!";
		}
	
		return super.toString() + "I must be fed!";
	}
	
	public boolean equals (PuppyDog lildawg)
	{
		if(super.equals(lildawg) &&
		   this.isFedUpWithLife == lildawg.isFedUpWithLife)
		{
			return true;
		}
		return false;
	}
}

