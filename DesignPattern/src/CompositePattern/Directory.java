package CompositePattern;

import java.util.ArrayList;

public class Directory extends Entry{
	private String name;
	private ArrayList directory = new ArrayList();
	
	public Directory(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		int size=0;
		for (Object o : directory) {
			Entry entry = (Entry)o;
			size+=entry.getSize();
		}
		return size;
	}
	
	@Override
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix+"/"+this);
		for(Object o:directory) {
			Entry entry = (Entry) o;
			entry.printList(prefix+"/"+name);
		}
		
	}

}
/*
	디렉토리에는 크기를 나타내는 size필드가 없습니다.
	->디렉토리는 크기를 동적으로 계산하기 때문입니다.
	디렉토리내부에는 디렉토리 엔트리가 포합될 수 있기 때문에 ArrayList타입의 director필드를
	가지고 있습니다.
	getSize 메소드를 수행하면 iterator 반복문이 동작하며 directory 내부의 디렉토리 엔트리를 각각
	꺼내어 getSize()를 호출합니다. 파일이던 디렉토리던 getSize()메소드를 구현하고 있기 때문에 동작합니다.
	이처럼 디렉토리와 파일을 동일시하는 것이 CompositePattern의 특징입니다.
	
 */