
public class Boxer extends Fighter implements FighterInterface {
	
	protected double handDamage;
	
	public Boxer(String firstName, String lastName, int weight, int age, double handDamage){
		super(firstName, lastName, weight, age);
		this.handDamage = handDamage;
	}
	
	@Override
	public double attack() {
		doHandPunch();
		return handDamage;
	}

	@Override
	public void block() {
		blockHandPunch();
	}

	public void doHandPunch(){
		System.out.println("Do Hand Punch!");
	}
	
	public void blockHandPunch(){
		System.out.println("Do Block Hand Punch!");
	}
	
}
