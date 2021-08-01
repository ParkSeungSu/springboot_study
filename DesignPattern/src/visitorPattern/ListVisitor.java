package visitorPattern;

import java.util.Iterator;

public class ListVisitor extends Visitor{
	private String currentdir = ""; //현재 주목하고 있는 디렉토리 이름 저장하는 필드
	
	@Override
	public void visit(File file) {
		System.out.println(currentdir+"/"+file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir+"/"+directory);
		String savedir = currentdir;
		currentdir = currentdir +"/"+directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry =(Entry)it.next();
			entry.accept(this);
		}
		currentdir=savedir;
	}

}
/*
	Visitor의 하위 클래스로 데이터 구조를 순회하며 종류를 표시하기 위한 클래스입니다.
	visit(File) 과 visit(Directory)를 구현합니다.
	visit(File):File클래스의 인스턴스에 대해서 실행해야 할 처리를 구현하는 곳
	visit(Directory):Directory클래스의 인스턴스에 대해서 실행해야 할 처리를 구현하는 곳
	
 */