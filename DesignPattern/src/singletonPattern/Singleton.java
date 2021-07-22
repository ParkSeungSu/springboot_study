package singletonPattern;

public class Singleton {
	private static Singleton singleton= new Singleton();
	
	private Singleton() {
		System.out.println("Created Singleton");
		
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
/*
 	Singleton 패턴에는 Singleton의 역할만이 존재합니다.
 	Singleton 의 역할은 유일한 인스턴스를 얻기 위한 static 메소드를 가지고 있습니다.
 	이 메소드는 언제나 동일한 인스턴스를 반환합니다.
 */

/*
	왜 제한할 필요가 있는가?
	제한을 한다는 것은 전제가 되는 조건ㅇ르 늘린다는 의미입니다.
	복수의 인스턴스가 존재하면 서로가 영향을 미치고,
	사이드 이펙트가 발생할 가능성이 있습니다. 
	하지만, 인스턴스가 1개밖에 없다는 보증이 있으면 그 전제조건 아래에서
	프로그래밍 할 수 있습니다.
	
	언제 생성되는가?
	실행결과를 보면 created Singleton이라는 메세지가 start이후 출력되었습니다.
	이를 통해 프로그램 실행 후 최초로 getInstance 메소드가 호출될 때 Singleton 클래스가
	초기화 되고 static필드의 초기화도 이뤄지면서
	유일한 인스턴스가 만들어진다는 것을 확인할 수 있습니다.
	
 */
