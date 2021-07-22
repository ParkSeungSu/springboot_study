package builderPattern;
/*
 개요
 	도시에 빌딩(building)을 짓는 것을 build라 합니다. 빌딩을 짓는 순서는 우선
 	지반을 다지고 골격을 세우고, 아래에서 위로 조금씩 만들어 갑니다. 이처럼 복잡한 구조물을 한번에
 	완성시키는 것은 어렵기 때문에 전체를 구성하는 각 부분을 만들면서
 	단계를 밟아가며 만들어나갑니다
 	Builder 패턴 또한 이처럼 구조를 가진 인스턴스를 쌓아 올리는 방식의 패턴입니다.
 */
public class Main {

	public static void main(String[] args) {
		if(args.length!=1) {
			usage();
			System.exit(0);
		}
		if(args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.constructor();
			String result = textBuilder.getResult();
			System.out.println(result);
		}else if(args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director=new Director(htmlBuilder);
			director.constructor();
			String filename=htmlBuilder.getResult();
			System.out.println(filename+"가 작성되었습니다.");
		}else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage() {
		System.out.println("Usage: java Main plain 일반 텍스트로 문서 작성");
		System.out.println("Usage: java Main html HTML 파일 문서 작성");
	}

}

/*
 	프로젝트 구동시 인자값으로 주어지는 args 에 따라 plain과 html으로 분기합니다.
 	둘 다 동일한 Director 클래스의 constructor()를 사용하여 동일한 비즈니스 로직을 타지만,
 	구현부분은 각각 다릅니다.
 	
 */
