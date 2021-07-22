package protypePattern.framework;

import protypePattern.anonymous.Product;

public class MessageBox implements Product{
	
	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar=decochar;
	}
	
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i=0;i<length+4;i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar+" "+s+" "+ decochar);
		for (int i=0; i<length+4;i++) {
			System.out.print(decochar);
		}
		System.out.println(" ");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p=(Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
}

/*
	java의 clone 메소드는 자신의 클래스(혹은 하위 클래스)에서만 호출할 수 있기 때문에
	Manager클래스에서 바로 복제하는 게 아닌 createClone()과 같은 메서드를 이용해
	clone을 구현할 필요가 있다.
	
 */
