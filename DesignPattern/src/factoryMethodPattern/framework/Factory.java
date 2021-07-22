package factoryMethodPattern.framework;

public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}

/*
	product역할을 생성하는 추상 클래스는 framework쪽에 가깝습니다. 구체적인 내용(구현부)는
	ConcreteCreator역할이 결정합니다.
	예제에서는 Factory 클래스가 이 역할을 수행합니다.
	Creator역할은 실제로 생성하는 ConcreteProduct 역할에 가지고 있는 정보가 없습니다.
	Creator역할이 가지고 있는 정보는 Product 역할과 인스턴스 생성의 메소드를 호출하면
	Product가 생성된다는 것 뿐입니다.
	new 를 사용해서 실제 인스턴스를 생성하는 대신에, 인스턴스 생성을 위한 메소드를 호출해서
	구체적인 클래스 이름에 의한 속박에서 상위 클래스를 자유롭게 만듭니다.
	
 */