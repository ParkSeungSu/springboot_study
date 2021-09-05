package observerPattern;

/**
 * 
 * 숫자로 수를 표시하는 클래
 *
 */
public class DigitObserver implements Observer{

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:"+generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
		
	}

}
/*
	Observer 인터페이스를 구현하는 클래스로 관찰할 수(number)를 숫자로 표시하기 위한 것.
*/