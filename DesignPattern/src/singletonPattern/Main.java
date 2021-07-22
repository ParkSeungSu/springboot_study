package singletonPattern;
/*
	우리는 보통 new 명령어를 통해 인스턴스를 생성해서 사용합니다. new 를 통해 IDCard 클래스를 
	10번 호출하면 10개의 IDCard 인스턴스가 생기는 것이죠.
	
	그런데 클래스의 인스턴스가 단 하나만 필요한 경우가 있습니다. 시스템안에서 하나의 인스턴스만 생성되서
	사용되야하는 클래스들인데
	예를 들면 회사내의 공공재로 사용하는 프린터나 컴퓨터등이 그렇습니다. 우리가 원한다고 마음대로 new 를 통해
	생성할수도 없습니다.
	
	물론, 조심해서 new 를 한 번만 사용해서 1개의 인스턴스만 사용하겠다고 할 수도 있지만, 이것은 결코 지정한 클래스가
	'절대로' 1개 밖에 존재하지 않는 것을 '보증'할 수 없습니다. 
	이처럼 인스턴스가 한 개밖에 존재하지 않는 것을 보증하는 패턴을
	Singleton Pattern이라고 합니다.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Start");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("instace1과 instance2 동일성 비교::"+(instance1==instance2));
		
		System.out.println("End");
	}

}
/*
	장점
	1. 외부에서 생성할 수 업다.
	2. 고정된 영역에 미리 할당한다 ('static area')
	3. 고정된 영역에 할당하기에 메모리를 낭비하지 않는다.
	4. JVM이 종료되기 전까지 계속 사용할 수 있다.
 */