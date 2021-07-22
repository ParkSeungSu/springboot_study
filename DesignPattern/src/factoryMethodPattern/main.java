package factoryMethodPattern;

import factoryMethodPattern.framework.Factory;
import factoryMethodPattern.framework.Product;
import factoryMethodPattern.idcard.IDCardFactory;

/*
 객체를 만들어내는 부분을 서브클래스(SUB-Class)에 위임하는 패턴
 즉 new 명령어를 호출해 객체를 생성하는 역할을 서브 클래스에 위임하는 것입니다.
 결국 팩토리 메소드 패턴은 객체를만들어내는 공장을 만드는 패턴이라고 할 수 있습니다.
 
 팩토리 메소드 패턴에서는 인스턴스를 만드는 방법을 상위 클래스 측에서 결정하지만 구체적인 클래스 명 까지는
 결정하지 않습니다.
 
 구체적인 내용은 모두 하위 클래스 측에서 수행합니다. 따라서 인스턴스 생성을 위한 골격(Framework) 과
 실제의 인스턴스 생성의 클래스를 분리해서 생각할 수 있습니다.
 
 */


public class main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("아만");
		Product card2 = factory.create("실리안");
		card1.use();
		card2.use();
	}

}
