package templateMethodPattern.army;

import templateMethodPattern.army.armor.SteelArmor;
import templateMethodPattern.army.weapon.Gun;
import templateMethodPattern.city.Citizen;

public class SoldierConscriptionHelperIml extends AbstSoldierConscriptionHelper {

	@Override
	protected Citizen conscriptionCitizen() {
		System.out.println("징집!");
		return new Citizen();
	}

	@Override
	protected void training(Citizen citizen) {
		citizen.updateStrength(5);
		citizen.updateAgility(4);
		citizen.updateIntelligence(-3);
		System.out.println("병사 훈련!");
		
	}

	@Override
	protected void supplyEquipment(Soldier soldier) {
		soldier.setWeapon(new Gun());
		soldier.setArmor(new SteelArmor());
		System.out.println("장비 보급!");
	}

	@Override
	protected Soldier changeOfPosition(Citizen citizen) {
		System.out.println("시민 -> 병사 변경!");
		return new Soldier(citizen);
	}

}
