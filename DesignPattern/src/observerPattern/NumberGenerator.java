package observerPattern;

import java.util.ArrayList;

/**
 * 
 * 수를 생성하는 오브젝트를 나타내는 클래
 *
 */
public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	public void notifyObservers() {
		for(Object o : observers) {
			Observer observer = (Observer)o;
			observer.update(this);
		}
	}
	public abstract int getNumber();
	public abstract void execute();
}
/*
	수를 생성하는 추상 클래스로 실제의 수의 생성/취득하는 부분은 하위클래스에서 구현됩니다.
	(subclass resposibility)
	
	observers 필드는 NumberGenerator를 관찰 (혹은 구독) 하고 있는
	Observer를 보존하는 필드입니다. add or delete 메소드로 Observer추가/삭제합니다.
	
	notifyObserver 메소드를 통해 자신을 관찰하고있는 Observer들에게 알립니다.
 */
