package decoratorPattern;

public class SideBorder extends Border {
	private char borderChar;

	public SideBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	@Override
	public int getColumns() {
		return 1+display.getColumns()+1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar+display.getRowText(row)+borderChar;
	}

}
/*
	장식(Border)의 구현클래스로 문자열의 좌우에 정해진 문자(borderChar)로 장식을 합니다.
	-> contents=>decoChar contents decoChar
 */