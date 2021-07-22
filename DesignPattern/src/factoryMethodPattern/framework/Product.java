package factoryMethodPattern.framework;

public abstract class Product {
	public abstract void use();
}
/*
	framework에 포함되어있습니다.
	이 패턴에서 생성되는 인스턴스가 가져야 할 인터페이스(API)를 결정하는 추상 클래스입니다.
	구체적인 내용(구현부)은 ConcreteProduct 역활이 결정합니다.
	
 */