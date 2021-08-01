package BridgePattern;

public class Display {
	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl=impl;
	}
	public void open() {
		impl.rawOpen();
	}
	public void print() {
		impl.rawPrint();
	}
	public void close() {
		impl.rawClose();
	}
	public final void display() {
		open();
		print();
		close();
	}
}
/*
 	이름만 봐도 클래스 목록중 가장 심플합니다.Display는 '기능의 클래스 계층'의 최상위 클래스 입니다.
 	최상위 클래스지만 추상클래스가 아닌 이유는 브릿지 패턴(Bridge Pattern)이기 때문인데, 코드에서
 	impl 가 다리 역할을 합니다.
 	구현의 최상위 계층인DisplayImpl를 인자로 받아 Display의 메소드를 실행하기 위해 (open,print,close)기능의
 	구현 부분을 호출(rawOpen, rawPrint, rawClose)해 동작합니다.
 	
 */