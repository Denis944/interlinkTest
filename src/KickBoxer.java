
public class KickBoxer extends Boxer {
	
	public KickBoxer(String firstName, String lastName, int weight, int age){
		super(firstName, lastName, weight, age);
	}
	
	public void doLegPunch(){
		System.out.println("Do Leg Punch!");
	}
	
	public void blockLegPunch(){
		System.out.println("Do Block Leg Punch!");
	}

	@Override
	public void fight() {
		super.fight();
		doLegPunch();
	}
	
	@Override
	public void block() {
		super.block();
		blockLegPunch();
	}
	
}
