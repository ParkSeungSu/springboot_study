package templateMethodPattern;

import templateMethodPattern.army.AbstSoldierConscriptionHelper;
import templateMethodPattern.army.Soldier;
import templateMethodPattern.army.SoldierConscriptionHelperIml;
import templateMethodPattern.city.Citizen;

public class main {

	public static void main(String[] args) {
		Citizen h1 = new Citizen();
		AbstSoldierConscriptionHelper helper = new SoldierConscriptionHelperIml();
		Soldier soldier = helper.conscription();
		soldier.attak();
		soldier.defense();

	}

}

/*
 템플릿은 비유하자면 일종의 붕어빵 틀, 타코야끼 틀과 비슷하다고 볼 수 있으며, 알고리즘의 구조를 메소드에 정의하고
 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴
 
 <사용처>
 일정한 프로세스를 가진 요구사항을템플릿 메소드 패턴을 이용하여 구현할 수 있다.
 
 Spring Security의 인증및 인가과정, 어노테이션 프로세서의 라운드 구조, 로직의 완성까지의 로직이
 순차적인 일정한 단계가 있는 경우 등.
 요구사항
→ 시민들을 징집해서 병사로 만들어 주세요.
•
conscription():Soldier
1.
시민들 중 마린이 될 수 있는 조건의 시민 징집합니다.
•
conscriptionCitizen():Citizen
2.
징집된 군인들을 훈련합니다.
•
traning(Citizen):void
3.
보직을 시민에서 병사로 변경합니다.
•
changeOfPosition(Citizen citizen):Soldier
4.
장비를 보급합니다.
•
supplyEquipment(Solder soldier);
정리: 요구사항을 보면 시민들을 징집해 병사로 만들라는 요구사항입니다. 
그리고 시민을 징집해 병사가 되기까지의 과정을 생각하면 위와같은 일련의 과정들을 거쳐야 합니다.
그리고 각 과정(process)을 가지고 각각의 알고리즘들은 차후 변경될 가능성도 있습니다.
(ex: 훈련의 내용이 바뀐다, 보급하는 장비가 변경된다. 등등...)
 
 
 
위와 같이 구현을 하게되면 각각의 상세 요구사항들을 모듈화 했기 떄문에 재사용성을 높히고 강화되거나
변경된 정책이나 요구사항을 적용하기가 더 편해집니다. 예를들어 훈련내용이 변경되어 근력강화 훈련을
줄이고, 지능 강화 훈련을 높혀서 시민의 스탯변경을 바꾸려고 하면 SoldierConscriptionHelperImpl
구현체의 training 메서드 내용만 변경하면 된다.

결론 : 이처럼 일정한 프로세스를 가진 요구사항을 알고리즘으로 정의할 때 알고리즘의 구조를 메소드에 정의 후 하위
클래스에서 알고리즘 구조의 변경 없이 알고리즘을 재정의 하는 패턴을 템플릿 메서드 패턴이라 한다.
 */
