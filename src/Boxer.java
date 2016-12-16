
public class Boxer extends Fighter implements FighterInterface {
	
	public Boxer(String firstName, String lastName, int weight, int age){
		super(firstName, lastName, weight, age);
	}
	
	@Override
	public void fight() {
		doHandPunch();
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
