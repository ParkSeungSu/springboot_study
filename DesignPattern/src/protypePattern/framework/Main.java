package protypePattern.framework;

import protypePattern.anonymous.Manager;
import protypePattern.anonymous.Product;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('⚒');
		
		manager.register("Strong Message", upen);
		manager.register("Warning Box", mbox);
		manager.register("Slash Box", sbox);
		
		Product p1 = manager.create("Strong Message");
		p1.use("Hello, world.");
		Product p2 = manager.create("Warning Box");
		p2.use("Hello, world");
		Product p3 = manager.create("Slash Box");
		p3.use("Hello, world");
	}

}
/*
 프로토타입 패턴의 필요성
 	그냥 new SomethingClass()로 인스턴스를 생성하면 빠른데 어째서 프로토 타입패턴(PrototypePattern)
 	이 필요할까요.
 	Explain 에 UseCase를 통해 간략하게 정의했지만 좀 더 풀어서 예제를 참고해서 설명하겠습니다.
 	
 	예제에서는 ~,*,/ 세 가지 문자열을사용한 3가지의 MessageBox인스턴스를 만들었습니다만,
 	실무에서는 충분히 더 많은 종류의 인스턴스가 생성될 수 있습니다. 하지만 이걸 모두 각각의 클래스로
 	관리하기에는 너무 많기 때문에 관리의 용이성이 떨어집니다.
 	
 	그리고, 클래스로부터 인스턴스 생성이 어려운 경우가 있다고 했는데, 쉽게 예를 들면
 	게임 커스터마이징 프리셋을 생각하시면 쉽습니다.
 	다양한 스킬이 다 설정된 스킬세팅 인스턴스를 매번 프로그래밍 해서 만드는 것은 몹시 번거롭고
 	어려운 일입니다.
 	그렇기에 클래스를 사용하는 것이 아닌 인스턴스를 복사해서 만드는 방법이 간단합니다.
 	
 참고
 
 클래스 이름은 속박인가?
 	특정 클래스명이 소스코드 안에 있을 경우 소스코드와 이 클래스를 분리해서 재사용할 수 없게됩니다. 
 	물론, 소스를 고쳐서 클래스 이름을 변경할 수 있지만 '부품으로써 재이용'관점에서 소스를 고칠 수 있는지는
 	중요하지 않습니다.
 	java에서는 클래스파일(.class)만 가지고 있더라고 그 클래스를 재사용 할 수 있는지가 중요합니다.
 	핵심은 소스 파일(.java)이 없어도 재사용할 수 있는지가 중점입니다.
 	
 	강결합이 되어야하는 클래스 명이 소스 안에 있는것 문제가 되지 않지만, 부품으로써 모듈화 해야하는 
 	클래스 명이 소스안에 사용되는 것은 문제가 됩니다.
 	
 */