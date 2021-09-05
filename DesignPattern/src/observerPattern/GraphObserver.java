package observerPattern;

/**
 * 
 * 간이 그래프로 수를 표시하는 그래
 *
 */
public class GraphObserver implements Observer{

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("GraphObserver");
		int count = generator.getNumber();
		for (int i =0; i<count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
/*
	Observer 인터페이스를 구현하는 클래스로 관찰한 수(number)를 간이그래프로 표시합니다.
 */
