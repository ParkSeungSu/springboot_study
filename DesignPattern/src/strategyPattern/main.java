package strategyPattern;

public class main {

	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
	}

}

/*
 
 여러 알고리즘을 하나의 추상적인 접근점(interface)를 만들어 접근점에서 
 서로 교환 가능(Delegate)하도록 하는 패턴
 
 사용자는 자신에게 맞는 전략을 취사선택하여 로직을 수행할 수 있게하는방법
 
 게임으로 예를 들면
 캐릭터는 공격이라는 작업을 수행함에 있어 무기를 상황에 맞게 선택해서 
 공격을 위임할 수 있다.
 
 */
