package visitorPattern;

public class File extends Entry {
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name=name;
		this.size=size;
		
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

}
/*
 	Composite 패턴의 File과 비슷하지만 accept 메소드를 구현해야 합니다.
 	visit메소드를 호출하며 자신의 인스턴스(this)를 인자값으로 알려줍니다.
 	
 */