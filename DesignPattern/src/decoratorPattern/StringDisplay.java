package decoratorPattern;

public class StringDisplay extends Display {
	private final String string; // 표시 문자열

	public StringDisplay(String string) { // constructor에서 표시문자열 지정
		this.string = string;
	}

	@Override
	public int getColumns() {// 문자수
		return string.getBytes().length;
	}

	@Override
	public int getRows() { //행수는 1
		return 1;
	}

	@Override
	public String getRowText(int row) {//row가 0일때만 반환
		
		return (row==0)?string:null;
	}

}
/*
	1행의 문자열을 표시하는 클래스로 Display를 상속받은 하위 클래스
	getRowText메소드를 보면 row가 0일때만 표시 문자열인 string 을 반환하는데, 
	Box 클래스로 비교하면 최초 원천 객체 내용만 반환한다는 의미입니다.
	
 */