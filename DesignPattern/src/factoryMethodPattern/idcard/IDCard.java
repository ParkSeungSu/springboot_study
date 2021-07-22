package factoryMethodPattern.idcard;

import factoryMethodPattern.framework.Product;

public class IDCard extends Product{

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner+"의 카드를 만듭니다.");
		this.owner=owner;
	}
	@Override
	public void use() {
		System.out.println(owner+"의 카드를 사용합니다.");
	}
	public String getOwner() {
		return owner;
	}
}

/*
	구체적인 제품을 결정하며 idcard쪽에 해당합니다. 예제에서는 IDCard 클래스가 이 역할을 수행합니다.
	
 */
