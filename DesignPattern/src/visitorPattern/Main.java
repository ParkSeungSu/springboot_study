package visitorPattern;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi",10000));
			bindir.add(new File("latex",20000));
			rootdir.accept(new ListVisitor());
			
			System.out.println("");
			System.out.println("Making user entries...");
			Directory kim = new Directory("Kim");
			Directory lee = new Directory("Lee");
			Directory park = new Directory("Park");
			usrdir.add(kim);
			usrdir.add(lee);
			usrdir.add(park);
			kim.add(new File("diary.html",100));
			kim.add(new File("Composite.java", 200));
			lee.add(new File("memo.txt",300));
			park.add(new File("game.doc",400));
			park.add(new File("junk.mail",500));
			rootdir.accept(new ListVisitor());
		}catch(FileTreatmentException e) {
			e.printStackTrace();
		}
	}

}

/*
개요
	=>데이터 구조와 처리르 분리하는 패턴
	데이터 구조 안에는 많은 요소가 저장되어 있고, 그 각 요소에 대해서 처리해간다고 할 때 
	처리부분은 어디에 정의되야 할까요?
	평번하게 생각하면 데이터 구조를 표시하고 있는 클래스내에 정의를 할 것입니다. 
	하지만 그 처리가 여러종류라면 새로운 처리가 필요할 때마다 데이터 구조의 클래스를 수정해야 합니다.
	
	Visitor Pattern에서는 데이터구조와 처리를 분리하여 데이터 구조 내부를 순회하는 방분자 클래스를
	준비해서 그 클래스에게 처리를 위임합니다.
	
	이렇게 설계를 할 경우 새로운 처리를 추가할 때는 새로운 방문자를 만들면 됩니다.
	그리고 데이터 구조영역에서는 순회하려는 방문자에 대해 접근을 허용하면 됩니다.
	
 */
