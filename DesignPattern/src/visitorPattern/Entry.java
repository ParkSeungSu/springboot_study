package visitorPattern;

import java.util.Iterator;

public abstract class Entry implements Element{
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public Iterator iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public String toString() {
		return getName()+" ("+getSize()+")";
	}
}
/*
	Element인터페이스를 구현하여 Visitor Pattern 을 적용시킵니다.
	Element추상 클래스를 상속받는 File과 Directory클래스를 Entry가 구현하는 
	Element의 accept를 구현해야 합니다.
	
 */