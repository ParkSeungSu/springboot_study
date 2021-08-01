package decoratorPattern;

public abstract class Border extends Display {
	protected Display display;
	public Border(Display display) {
		this.display=display;
	}
}
/*
	장식(Decorator) 추상 클래스입니다.
	장식을 표시하는 클래스이지만 문자열 표시를 실행하는 Display 클래스의 하위 클래스로 정의합니다.
	상속에 의해 장식은 내용물과 동일한 메소드를 가집니다.(getColumns, getRows, getRowText, show)
	->인터페이스(API)적으로 장식과 내용물을 동일시 할 수 있다는 의미
	display필드는 장식으로 쌓여있는 내용물 내용물은 display의 구현 클래스일수도 있고, 또 다른 
	장식일수도 있습니다.

 */