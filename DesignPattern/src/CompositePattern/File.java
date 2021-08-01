package CompositePattern;

public class File extends Entry{
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name=name;
		this.size=size;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix+"/"+this);
	}

}
/*
 	파일을 표현하는 클래스이고 이름(name)과 크기(size)를 가집니다.
 	prefix+"/"+this, prefix +"/"+ this.toString(), prefix+"/"+toString()
 	모두 동일합니다.
 	
 */