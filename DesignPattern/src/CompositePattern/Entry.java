package CompositePattern;

public abstract class Entry {
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);
	public String toString() {
		return getName()+" ("+getSize()+")";
	}
}

/*
	Entry는 추상 클래스로서 디렉토리와 파일을 하나로 합친 엔트리 클래스입니다.
	디렉토리 엔트리는 이름을 가지고 있기 때문에 getName, 크기를 얻기위한 getSize메소드가 
	명세되어 있으며 하위 클래스에서 역할을 맞게 구현합니다.
	디렉토리 안에 디렉토리 or 파일을 넣는 메소드는 add 입니다. 이 역시 구현은 하위 클래스에서 구현
	printList메소드는 인자가 있을때와 없을때를 각각 오버로드(overload)해서 호출을 어떻게 하느냐에따라
	맞는 로직이 수행됩니다.
	-> 인자값이 있는 printList는 접근제어자 protected에 의해 Entity의 하위 클래스에서만 사
 */