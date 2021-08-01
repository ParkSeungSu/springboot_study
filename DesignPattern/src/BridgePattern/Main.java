package BridgePattern;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new Display(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d1.display();
		d2.display();
		d3.display();
		
		d3.multiDisplay(5);
	}

}
/*
 개요
 	기능의 클래스 계층과 구현의 클래스 계층간의 다리(Bridge)를 놓는 역할을 하는 패턴입니다.
 
 클래스 계층의 혼재와 클래스 계층의 분리
 	기능의 클래스 계층과 구현의 클래스 계층에 대해 알아봤습니다. 
 	이제 하위 클래스를 만들기 전, 내가 만들고자 한 클래스가 구현을 위함인가, 기능의 확장을 위함인가를
 	고려해야 합니다. 클래스 계층이 하나라면 기능의 클래스 계층과 구현의 클래스 계층이 하나의 계층구조안에서	
 	혼재하게 됩니다. 그렇게 될 경우 클래스 계층이 복잡해져서 예측을 어렵게하고, 하위 클래스를 만들고자 할 때 클래스 계층의 어디에
 	만들면 좋을지 더 복잡해지게 됩니다.
 	
 	그렇기 때문에 두 개의 계층을 독립 된 클래스 계층으로 분리합니다. 단순히 분리만 해버릴 경우 흩어져버리기 때문에
 	두 개의 클래스 계층 사이에 다리를 놓는 일이 필요한데, 이를 Bridge Pattern을 통해 해결합니다.
 	
 역할
  1. Abstraction(추상화)의 역할
 	기능의 클래스 계층의 최상위 클래스 입니다. Implementor 역할의 메소드를 사용해서 기본적인 기능만이 기술되어 있는 클래스
 	이 인스턴스는 Implementor 역할을 가지고 있습니다. 예제에서는 Display 클래스가 해당 역할을 합니다.
 	
  2. RefineAbstraction(개선된 추상화)의 역할
  	Abstraction 역할에 대해 기능을 추가한 역할.
  	예제에서는 CountDisplay가 해당됩니다.
  
  3. Implementor(구현자)의 역할
	구현의 클래스 계층의 최상위 클래스입니다. Abstraction역할의 인터페이스(API)를 구현하기 위한 메소드를 규정하는 역할입니다.
	예제에서는 DisplayImpl 클래스가 이 역할을 합니다.
	
  4. Concrete Implementor(구체적인 구현자)의 역할
	Implementor역할의 인터페이스(API)를 구체적으로 구현하는 역할입니다.
	예제에서는 StringDisplayImpl 이 해당됩니다.
 */