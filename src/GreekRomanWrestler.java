
public class GreekRomanWrestler extends Fighter implements FighterInterface,WrestlerTechniques {

	public GreekRomanWrestler(String firstName, String lastName, int weight, int age){
		super(firstName, lastName, weight, age);
	}
		
	@Override
	public void fight() {
		System.out.println("Fight as Wrestler!");	
	}

	@Override
	public void block() {
		System.out.println("Do Wrestler Block!");
	}

	@Override
	public void doFootStep() {
		System.out.println("Do Footstep as GreekRoman Wrestler");
	}

	@Override
	public void doThrow() {
		System.out.println("Do Throw as GreekRoman Wrestler");		
	}

	@Override
	public void doCatch() {
		System.out.println("Do Catch as GreekRoman Wrestler");
	}
}
