package BridgePattern;

public abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}
/*
 	구현의 클래스 계층의 최상위 클래스인 DisplayImpl이며 추상 클래스 입니다. 
 	rawOpen, rawPrint, rawClose 3개의 메소드를 가지고 있으며, Display클래스의	
 	open, print, close 에 각각 대응하며 전처리,표시,후처리를 실행합니다.
 	
 */