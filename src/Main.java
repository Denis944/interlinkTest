import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<FighterInterface> troop = new ArrayList<FighterInterface>();
		troop.add(new KickBoxer("Bob", "Jonas", 80, 20, 14, 23));
		troop.add(new Boxer("Vitaliy", "Klitschko", 85, 30, 13));
		troop.add(new MMAFighter("John", "Sina", 110, 40, 22, 10, 40));
		double overallTroopDamage = 0;
		for (int i = 0; i < troop.size(); i++) {
			double fighterDamage = troop.get(i).attack();
			System.out.println("Fighter " + i + " damage = " + fighterDamage);
			overallTroopDamage += fighterDamage;
		}
		System.out.println("Overall damage = " + overallTroopDamage);
	}

}
