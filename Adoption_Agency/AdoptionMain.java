/**
* Inheritence is so cool 
*/
public class AdoptionMain {

	public static void main(String[] args) 
	{
		Dog alan = new Dog (10, "Alan", false);
		PuppyDog aden = new PuppyDog (5, "Aden" , false, false);
		Dog tungtungtungtungtungsahur = new Dog (6, "Tungtungtungtungtungsahur", true);
		Dog tralalelotralala = new Dog (6, "Tungtungtungtungtungsahur", true);
		//System.out.println(alan.getAdoptionStatus());
		//System.out.println(aden.getAdoptionStatus());
		alan.increaseAge();
		aden.increaseAge();
		//alan.stateAge();
		//aden.stateAge();
		//System.out.println(alan);
		//System.out.println(aden);
		//System.out.println(alan.toString());
		System.out.println(tungtungtungtungtungsahur.equals(tralalelotralala));
	}
