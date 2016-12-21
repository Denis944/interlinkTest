
public class KickBoxer extends Boxer {

	protected double legDamage;

	private static final double LEG_DAMAGE_KOFFICIENT = 0.5;

	public KickBoxer(String firstName, String lastName, int weight, int age, double handDamage, double legDamage) {
		super(firstName, lastName, weight, age, handDamage);
		this.legDamage = legDamage;
	}

	public void doLegPunch() {
		System.out.println("Do Leg Punch!");
	}

	public void blockLegPunch() {
		System.out.println("Do Block Leg Punch!");
	}

	@Override
	public double attack() {
		doLegPunch();
		return super.attack() + LEG_DAMAGE_KOFFICIENT * this.legDamage;
	}

	@Override
	public void block() {
		super.block();
		blockLegPunch();
	}

}
