package builderPattern;

public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
	
}
/*
 	문서를 만들 메서드들을 선언하고 있는 추상 클래스 입니다.
 	각각 타이틀(makeTitle), 문자열(makeString), 개별항목(makeItems)을 구현하는 메소드이고
 	마무리짓는 메소드는 close입니다.
 	Builder 역할은 인스턴스를 생성하기 위한 인터페이스(API)를 결정합니다.
 	Builder 역할에는 인스턴스의 각 부분을 만들기 위한 메소드가 준비되어 있습니다.
 	
 */