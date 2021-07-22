package builderPattern;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder=builder;
	}
	public void constructor() {
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] {"좋은 아침입니다.","안녕하세요"});
		builder.makeString("밤에");
		builder.makeItems(new String[] {
				"안녕하세요",
				"안녕히 주무세요.",
				"안녕히 계세요."
		});
		builder.close();
	}
}
/*
 	Builer 추상클래스에 선언되어 있는 메소드를 사용해서 문서 생성 로직을 구현합니다.
 	실제로 Builder 클래스로 인스턴스가 인자값으로 오는 것은 불가능합니다.
 	(추상 클래스는 인스턴스 생성 불가능)
 	대신 Builder 클래스의 하위 클래스(구현 클래스 -TextBuilder,HTMLBuilder)의
 	인스턴스가 인자값으로 옵니다.
 	constructor는 메소드 문서 구축 메소드로 Builder에서 선언되어 있는 메소드만 사용합니다.
 	이 메소드를 호출하면 문서가 생성됩ㅂ니다.
 	Builder 역할의 인터페이스(API)를 사용해서 인스턴스를 생성합니다.
 	ConcreteBuilder 역할에 의존한 프로그래밍은 수행하지 않습니다.
 	ConcreteBuilder 역할과 관계없이 제대로 기능하도록 Builder 역할의 메소만 사용합니다.
 */