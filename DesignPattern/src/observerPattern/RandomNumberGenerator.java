package observerPattern;

import java.util.Random;

/**
 * 
 * 랜덤으로 수를 생성하는 클래스
 *
 */
public class RandomNumberGenerator extends NumberGenerator {
	private Random random =new Random();
	private int number;
	
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		
		for(int i = 0; i<20;i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
		
	}

}

/*
	실제로 랜덤 숫자를 생성하는 NumberGenerator의 하위 클래스
	
	execute 메소드에서 20번의 순회를 하며 매번 0~49사이의 정수를 생성해
	number에 대입 후 Observer에게 통지하는 notifyObservers 메소드를 호출합니다.
 */
