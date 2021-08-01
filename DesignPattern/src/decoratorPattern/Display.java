package decoratorPattern;

public abstract class Display {
	public abstract int getColumns(); // 가로 문자수를 얻는다.

	public abstract int getRows(); // 세로 행수를 얻는다.

	public abstract String getRowText(int row); // row번째의 문자열을 얻는다.

	public final void show() { // 전부 표시한다.
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
/*
	복수 행으로 구성되는 문자열을 표시하기 위한 추상 클래스
	show메소드에서 getRows로 행수를 알아내어 getRowText로 표시 할 문자열을 알아낸 뒤
	반복문을 돌며 모든 행을 표시합니다.
	->추상메소드를 이용한 스텝별 알고리즘은 TemplateMethod Pattern입니다.
 */