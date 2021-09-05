package observerPattern;

/**
 * 
 * 관찰자를 나타내는 인터페이스
 *
 */
public interface Observer {
	public abstract void update(NumberGenerator generator);
}


/*
	관찰자를 표현하는 인터페이스로 구체적인 관찰자(Concrete Observer)는
	해당 인터페이스를 구현합니다.
	
	update 메소드는 NumberGenerator 클래스에서 호출됩니다.
	generator가 자신이 변경되었음을 알리며 자기자신을 인자로 전달합니다.
	
 */ 
