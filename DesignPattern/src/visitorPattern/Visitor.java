package visitorPattern;

public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Directory directory);
}
/*
	오버로드(overload)를 이용해 File및 Directory로 visit이 각각 가능하게 명세
*/