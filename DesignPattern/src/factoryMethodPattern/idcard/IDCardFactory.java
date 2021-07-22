package factoryMethodPattern.idcard;

import java.util.ArrayList;
import java.util.List;

import factoryMethodPattern.framework.Factory;
import factoryMethodPattern.framework.Product;

public class IDCardFactory extends Factory {
	
	private List owners = new ArrayList();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard)p).getOwner());
		
	}
	
	public List getOwners() {
		return owners;
	}
}
/*
	구체적인 제품을 만드는 클래스를 결정하며, idcard쪽에 해당됩니다. 예제 프로그램에서는 
	IDCardFactory 클래스가 이 역할을 수행합니다.
	
 */
