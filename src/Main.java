import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<FighterInterface> fighters = new ArrayList<>();
		fighters.add(new KickBoxer("Bob", "Jonas", 80, 20));
		fighters.add(new Boxer("Vitaliy", "Klitschko", 85, 30));
		fighters.add(new GreekRomanWrestler("John", "Sina", 110, 40));
		for (FighterInterface fighter : fighters) {
			fighter.fight();
		}
		// or
		attack(new KickBoxer("Bob", "Jonas", 80, 20));
	}

	private static void attack(FighterInterface fighter) {
		fighter.fight();
	}

}
