package visitorPattern;

public interface Element {
	public abstract void accept(Visitor v);
}
/*
	방문자를 받아들이는 인터페이스.
	방문자(Visitor)를 받아들이는 accept 메소드를 명
 */