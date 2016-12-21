
public class MMAFighter extends KickBoxer implements FighterInterface, WrestlerTechniques {

	protected double wrestlerDamage;

	public MMAFighter(String firstName, String lastName, int weight, int age, double handDamage, double legDamage,
			double wrestlerDamage) {
		super(firstName, lastName, weight, age, handDamage, legDamage);
		this.wrestlerDamage = wrestlerDamage;
	}

	@Override
	public double attack() {
		System.out.println("Use wrestler techniques");
		return super.attack() + this.wrestlerDamage;
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
