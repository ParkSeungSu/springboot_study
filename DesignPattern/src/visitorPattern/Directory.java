package visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
	
	private String name;
	private ArrayList directory = new ArrayList();
	
	public Directory(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getSize() {
		int size = 0;
		for (Object o :directory) {
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
	public Iterator iterator() {
		return directory.iterator();
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}


}
/*
	File과 동일하게 자기자신의 인스턴스를 알려주는 accept 메소드와 자신이 가지고 있는 
	dir collection의 iterator를 반환하는 iterator()함수를 구현합니다.
 */